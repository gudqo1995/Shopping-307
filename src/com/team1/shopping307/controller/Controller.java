package com.team1.shopping307.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.team1.shopping307.Libs.Libs;
import com.team1.shopping307.service.CateService;
import com.team1.shopping307.service.CateServiceImpl;
import com.team1.shopping307.service.LogHistService;
import com.team1.shopping307.service.LogHistServiceImpl;
import com.team1.shopping307.service.ProdService;
import com.team1.shopping307.service.ProdServiceImpl;
import com.team1.shopping307.service.ReleHistService;
import com.team1.shopping307.service.ReleHistServiceImpl;
import com.team1.shopping307.service.RevuService;
import com.team1.shopping307.service.RevuServiceImpl;
import com.team1.shopping307.service.TelService;
import com.team1.shopping307.service.TelServiceImpl;
import com.team1.shopping307.service.UsersService;
import com.team1.shopping307.service.UsersServiceImpl;

//@WebServlet("/TelController")
@WebServlet(urlPatterns = { "*.do", "/" })
public class Controller extends HttpServlet {
   private static final long serialVersionUID = 1L;
      
   public Controller() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      HttpSession session = request.getSession();

      // response.getWriter().append("Served at: ").append(request.getContextPath());
      request.setCharacterEncoding("UTF-8");
      response.setCharacterEncoding("UTF-8");
      
      String strUri = request.getRequestURI(); // project명/*.do
      String strPath = request.getContextPath(); // project명
      String strMap = strUri.substring(strPath.length() + 1);
      String strSessionId = session.getId();
      String jspName = null;
      
      System.out.println("Controller()");
      System.out.println(strUri);
      System.out.println(strPath);
      System.out.println("요청주소: " + strMap);
      System.out.println("session ID.: " + strSessionId);

      try {
         String strRole = LoginManager.getUserRole(strSessionId);
         System.out.println("Role: " + strRole);
         
         switch (strMap) {
         //---------------------------------------
         // 1. 사용자 정보(users)
         //---------------------------------------
         case Common.strUsersSelectAllDo: {
            UsersService svc = new UsersServiceImpl();
            svc.selectAll(request, response);
            jspName = Common.strUsersSelectAll;
            break;
         }
         case Common.strUsersSelectOneDo: {
            UsersService svc = new UsersServiceImpl();
            svc.selectOne(request, response);
            jspName = Common.strUsersSelectOne;
            break;
         }
         case Common.strUsersInsertDo: {
            UsersService svc = new UsersServiceImpl();
            svc.insert(request, response);
            jspName = Common.strUsersInsert;
            break;
         }
         case Common.strUsersUpdateDo: {
            UsersService svc = new UsersServiceImpl();
            svc.update(request, response);
            jspName = Common.strUsersUpdate;
            break;
         }
         case Common.strUsersDeleteDo: {
            UsersService svc = new UsersServiceImpl();
            svc.delete(request, response);
            jspName = Common.strUsersDelete;
            break;
         }
            
         //---------------------------------------
         // 2. login 히스토리 정보 (login_history)
         //---------------------------------------
         case Common.strLogHistSelectAllDo: {
            LogHistService svc = new LogHistServiceImpl();
            svc.selectAll(request, response);
            jspName = Common.strLogHistSelectAll;
            break;
         }
         case Common.strLogHistSelectOneDo: {
            LogHistService svc = new LogHistServiceImpl();
            svc.selectOne(request, response);
            jspName = Common.strLogHistSelectOne;
            break;
         }
         case Common.strLogHistInsertDo: {
            LogHistService svc = new LogHistServiceImpl();
            svc.insert(request, response);
            jspName = Common.strLogHistInsert;
            break;
         }
         case Common.strLogHistUpdateDo: {
            LogHistService svc = new LogHistServiceImpl();
            svc.update(request, response);
            jspName = Common.strLogHistUpdate;
            break;
         }
         case Common.strLogHistDeleteDo: {
            LogHistService svc = new LogHistServiceImpl();
            svc.delete(request, response);
            jspName = Common.strLogHistDelete;
            break;
         }
         
         //---------------------------------------
         // 3. 카테고리 정보(category)
         //---------------------------------------
         case Common.strCateSelectAllDo: {
            CateService svc = new CateServiceImpl();
            svc.selectAll(request, response);
            jspName = Common.strCateSelectAll;
            break;
         }
         case Common.strCateSelectOneDo: {
            CateService svc = new CateServiceImpl();
            svc.selectOne(request, response);
            jspName = Common.strCateSelectOne;
            break;
         }
         case Common.strCateInsertDo: {
            CateService svc = new CateServiceImpl();
            svc.insert(request, response);
            jspName = Common.strCateInsert;
            break;
         }
         case Common.strCateUpdateDo: {
            CateService svc = new CateServiceImpl();
            svc.update(request, response);
            jspName = Common.strCateUpdate;
            break;
         }
         case Common.strCateDeleteDo: {
            CateService svc = new CateServiceImpl();
            svc.delete(request, response);
            jspName = Common.strCateDelete;
            break;
         }

         //---------------------------------------
         // 4. 상품 정보(product)
         //---------------------------------------
         case Common.strProdSelectAllDo: {
            ProdService svc = new ProdServiceImpl();
            svc.selectAll(request, response);
            jspName = Common.strProdSelectAll;
            break;
         }
         case Common.strProdSelectOneDo: {
            ProdService svc = new ProdServiceImpl();
            svc.selectOne(request, response);
            jspName = Common.strProdSelectOne;
            break;
         }
         case Common.strProdInsertDo: {
            ProdService svc = new ProdServiceImpl();
            svc.insert(request, response);
            jspName = Common.strProdInsert;
            break;
         }
         case Common.strProdUpdateDo: {
            ProdService svc = new ProdServiceImpl();
            svc.update(request, response);
            jspName = Common.strProdUpdate;
            break;
         }
         case Common.strProdDeleteDo: {
            ProdService svc = new ProdServiceImpl();
            svc.delete(request, response);
            jspName = Common.strProdDelete;
            break;
         }

         //---------------------------------------
         // 5. 상품 출고 히스토리(release_history)
         //---------------------------------------
         case Common.strReleHistSelectAllDo: {
            ReleHistService svc = new ReleHistServiceImpl();
            svc.selectAll(request, response);
            jspName = Common.strReleHistSelectAll;
            break;
         }
         case Common.strReleHistSelectOneDo: {
            ReleHistService svc = new ReleHistServiceImpl();
            svc.selectOne(request, response);
            jspName = Common.strReleHistSelectOne;
            break;
         }
         case Common.strReleHistInsertDo: {
            ReleHistService svc = new ReleHistServiceImpl();
            svc.insert(request, response);
            jspName = Common.strReleHistInsert;
            break;
         }
         case Common.strReleHistUpdateDo: {
            ReleHistService svc = new ReleHistServiceImpl();
            svc.update(request, response);
            jspName = Common.strReleHistUpdate;
            break;
         }
         case Common.strReleHistDeleteDo: {
            ReleHistService svc = new ReleHistServiceImpl();
            svc.delete(request, response);
            jspName = Common.strReleHistDelete;
            break;
         }

         //---------------------------------------
         // 6 장바구니(bag - table만 불필요)
         //---------------------------------------

         //---------------------------------------
         // 7. 결제 정보(pay_info)
         //---------------------------------------

         //---------------------------------------
         // 8. 후기 정보(review)
         //---------------------------------------
         case Common.strRevuSelectAllDo: {
            RevuService svc = new RevuServiceImpl();
            svc.selectAll(request, response);
            jspName = Common.strRevuSelectAll;
            break;
         }
         case Common.strRevuSelectOneDo: {
            RevuService svc = new RevuServiceImpl();
            svc.selectOne(request, response);
            jspName = Common.strRevuSelectOne;
            break;
         }
         case Common.strRevuInsertDo: {
            RevuService svc = new RevuServiceImpl();
            svc.insert(request, response);
            jspName = Common.strRevuInsert;
            break;
         }
         case Common.strRevuUpdateDo: {
            RevuService svc = new RevuServiceImpl();
            svc.update(request, response);
            jspName = Common.strRevuUpdate;
            break;
         }
         case Common.strRevuDeleteDo: {
            RevuService svc = new RevuServiceImpl();
            svc.delete(request, response);
            jspName = Common.strRevuDelete;
            break;
         }

         
         
         
         //---------------------------------------
         // 9. 교환/환불 정보(exchange)
         //---------------------------------------

         //---------------------------------------
         // 예제. TelInfo
         //---------------------------------------
         case "TelAllInfo.do": {
            TelService svc = new TelServiceImpl();
            svc.getAllInfo(request, response);
            jspName = "telAllView.jsp";
            break;
         }   
         case "TelOneInfo.do": {
            TelService svc = new TelServiceImpl();
            svc.getOneInfo(request, response);
            jspName = "telOneView.jsp";
            break;
         }   
         case "TelInsertInfo.do": {
            TelService svc = new TelServiceImpl();
            svc.insertInfo(request, response);
            jspName = "telResultView.jsp";
            break;
         }   
         case "TelUpdateInfo.do": {
            TelService svc = new TelServiceImpl();
            svc.updateInfo(request, response);
            jspName = "telResultView.jsp";
            break;
         }
         case "TelDelInfo.do": {
            TelService svc = new TelServiceImpl();
            svc.delInfo(request, response);
            jspName = "telResultView.jsp";
            break;
         }   
         }
      }
      catch(Exception e) {
         e.printStackTrace();
      }

      if (jspName != null) {
         // jspName이 ".jsp"로 끝나게 만들고 jspName를 호출 
         if(!Libs.getFileExt(jspName).toLowerCase().equals(".jsp")) {
            jspName += Common.strJsp;
         }
         System.out.println("처리 후 호출 jsp: " + jspName);
         
         // request.getRequestDispatcher(jspName)
         // .forward(request, response);
         RequestDispatcher rd = request.getRequestDispatcher(jspName);
         rd.forward(request, response);
      }
      else {
         // login
         System.out.println("처리 후 호출 jsp: null입니다.");
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      doGet(request, response);
   }

}
