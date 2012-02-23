package org.springside.examples.miniservice.webservice.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springside.examples.miniservice.webservice.WsConstants;
import org.springside.examples.miniservice.webservice.dto.UserDTO;
import org.springside.examples.miniservice.webservice.ws.result.DepartmentResult;
import org.springside.examples.miniservice.webservice.ws.result.UserListResult;
import org.springside.examples.miniservice.webservice.ws.result.base.IdResult;

/**
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义.
 * 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * @author calvin
 */
@WebService(name = "AccountService", targetNamespace = WsConstants.NS)
public interface AccountWebService {
	/**
	 * 获取部门的详细信息.
	 */
	DepartmentResult getDepartmentDetail(@WebParam(name = "id") Long id);

	/**
	 * 搜索用户信息.
	 */
	UserListResult searchUser(@WebParam(name = "loginName") String loginName, @WebParam(name = "name") String name);

	/**
	 * 新建用户.
	 */
	IdResult createUser(@WebParam(name = "user") UserDTO user);

}
