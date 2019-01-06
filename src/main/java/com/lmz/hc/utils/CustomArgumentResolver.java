package com.lmz.hc.utils;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomArgumentResolver implements HandlerMethodArgumentResolver {
	public static final String DATE_PATTERN1 = "yyyy-MM-dd";

	public static final String DATE_PATTERN2 = "yyyy-MM-dd HH:mm";

	public static final String DATE_PATTERN3 = "yyyy-MM-dd HH:mm:ss";
	
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		if (StringUtils.equals("userInfo", parameter.getParameterName())
				&& parameter.getParameterType().equals(UserInfo.class)) {
			return true;
		} else if (parameter.hasParameterAnnotation(JsonParam.class)) {
			return true;
		} else if (parameter.getParameterType().equals(Date.class)) {
			return true;
		}

		return false;
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {		
		if (StringUtils.equals("userInfo", parameter.getParameterName())
				&& parameter.getParameterType().equals(UserInfo.class)) {
//			return Utilities.getUserInfo(webRequest.getHeader(CustomInterceptorHandler.LOGIN_HEADER_NAME));
		} else if (parameter.hasParameterAnnotation(JsonParam.class)) {
			// String param = webRequest.getParameter(parameter.getParameterName());
			Object param =webRequest.getParameterMap().get(parameter.getParameterName());
			System.out.println(param);
			return param;
//			if (!StringUtils.isEmpty(param)) {
//				return webRequest.getParameter()
////				return JsonUtils.fromJson(param, parameter.getGenericParameterType());
//			} else {
//				return null;
//			}
		} else if (parameter.getParameterType().equals(Date.class)) {
			String param = webRequest.getParameter(parameter.getParameterName());

			if (!StringUtils.isEmpty(param)) {
				String pattern = param.length() == DATE_PATTERN1.length() ? DATE_PATTERN1
						: (param.length() == DATE_PATTERN2.length() ? DATE_PATTERN2 : DATE_PATTERN3);
				SimpleDateFormat format = new SimpleDateFormat(pattern);

				try {
					return format.parse(param);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				return null;
			}
		}

		return null;
	}
}
