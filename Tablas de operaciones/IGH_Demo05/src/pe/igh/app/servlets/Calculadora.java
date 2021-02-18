package pe.igh.app.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.igh.app.dto.TablaItem;
import pe.igh.app.service.TablaService;

@WebServlet({ "/Suma", "/Resta", "/TablaMultiplicar","/Calculadora" })
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String path = request.getServletPath();

		switch (path) {
		case "/Suma":
			suma(request, response);
			break;
		case "/Resta":
			resta(request, response);
			break;
		case "/Calculadora":
			calculadora(request, response);
			break;
		
		
		}

	}

	private void calculadora(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operacion =request.getParameter("comboOperacion");
		
		switch (operacion) {
		
		case "multiplicar":
			tablaMultiplicar(request, response);
			break;
		case "sumar":
			tablaSumar(request, response);
			break;
		case "restar":
			tablaRestar(request, response);
			break;
		case "dividir":
			tablaDividir(request, response);
			break;
		
		}
		
		
	}

	private void tablaDividir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Captura de datos
		int num = Integer.parseInt(request.getParameter("num"));
		// Proceso
		TablaService tablaService = new TablaService();
		List<TablaItem> lista = tablaService.dividir(num);
		// Reporte
		request.setAttribute("lista", lista);
		ServletUtil.forward(request, response, "resultadodiv.jsp");
		
	}

	private void tablaRestar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Captura de datos
		int num = Integer.parseInt(request.getParameter("num"));
		// Proceso
		TablaService tablaService = new TablaService();
		List<TablaItem> lista = tablaService.restar(num);
		// Reporte
		request.setAttribute("lista", lista);
		ServletUtil.forward(request, response, "resultado.jsp");
		
	}

	private void tablaSumar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Captura de datos
		int num = Integer.parseInt(request.getParameter("num"));
		// Proceso
		TablaService tablaService = new TablaService();
		List<TablaItem> lista = tablaService.sumar(num);
		// Reporte
		request.setAttribute("lista", lista);
		ServletUtil.forward(request, response, "resultado.jsp");
		
	}

	private void tablaMultiplicar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Captura de datos
		int num = Integer.parseInt(request.getParameter("num"));
		// Proceso
		TablaService tablaService = new TablaService();
		List<TablaItem> lista = tablaService.multiplicar(num);
		// Reporte
		request.setAttribute("lista", lista);
		ServletUtil.forward(request, response, "resultado.jsp");
	}

	private void resta(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Captura de datos
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		// Proceso
		int rpta = n1 - n2;
		// Reporte
		request.setAttribute("titulo", "RESTA");
		request.setAttribute("n1", n1);
		request.setAttribute("n2", n2);
		request.setAttribute("rpta", rpta);
		ServletUtil.forward(request, response, "calculadora.jsp");
	}

	private void suma(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// Captura de datos
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		// Proceso
		int rpta = n1 + n2;
		// Reporte
		request.setAttribute("titulo", "SUMA");
		request.setAttribute("n1", n1);
		request.setAttribute("n2", n2);
		request.setAttribute("rpta", rpta);
		ServletUtil.forward(request, response, "calculadora.jsp");
	}

}
