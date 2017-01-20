package BaseDatos;

public class Consultas {

	public static final String CONSULTA_EMPLEADOS 
	= "SELECT E.FIRST_NAME, E.EMPLOYEE_ID, E.SALARY, D.DEPARTMENT_NAME, E.DEPARTMENT_ID"
			+ " FROM EMPLOYEES E, DEPARTMENTS D"
			+ " WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID"
			+ " ORDER by E.SALARY DESC";
}
