package com.team1.shopping307.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team1.shopping307.VO.CateVO;
import com.team1.shopping307.VO.ProdVO;

public class CateServiceImpl implements CateService{

   @Override
   public ArrayList<CateVO> selectAll(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      return null;
   }

   @Override
   public CateVO selectOne(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      return null;
   }

   @Override
   public int insert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      return 0;
   }

   @Override
   public int update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      return 0;
   }

   @Override
   public int delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      return 0;
   }
   
}
