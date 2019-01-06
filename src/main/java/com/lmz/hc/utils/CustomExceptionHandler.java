package com.lmz.hc.utils;


import org.springframework.web.bind.annotation.ControllerAdvice;

//@ControllerAdvice
public class CustomExceptionHandler {
//	@ExceptionHandler
//	public void exp(HttpServletRequest request, HttpServletResponse response, Exception ex) throws IOException {
//		response.setStatus(HttpStatus.SC_OK);
//		response.setContentType("application/json;charset=UTF-8");
//		response.setHeader("error", "error");
//		Map<String, Object> error = Maps.newHashMap();
//		error.put("error", ex.getClass().getSimpleName());
//		if (ex instanceof ValidateException) {
//			error.put("message", ((ValidateException) ex).getMessages());
//		} else {
//			error.put("message", ex.getMessage());
//		}
//
//		if (ex instanceof ValidateException || ex instanceof NotLogedInException) {
//
//		} else {
//			ex.printStackTrace();
//		}
//		response.getWriter().print(JsonUtils.toJson(error));
//	}
}
