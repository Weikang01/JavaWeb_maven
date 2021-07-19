package com.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class VerificationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // refresh the browser every 2 secs
        resp.setHeader("refresh", "2");
        // create a image in memory
        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        // get graphic
        Graphics2D graphics = (Graphics2D) image.getGraphics();
        // set background color
        graphics.setColor(Color.white);
        graphics.fillRect(0,0,80,20);
        graphics.setColor(Color.blue);
        graphics.setFont(new Font(null, Font.BOLD, 20));
        graphics.drawString(genNum(), 0, 20);

        resp.setContentType("image/png");
        resp.setDateHeader("expires", -1);
        resp.setHeader("Cache-Control", "no-cache");
        resp.setHeader("Pragma", "no-cache");

        ImageIO.write(image, "png", resp.getOutputStream());
    }

    // gen random num
    private String genNum()
    {
        Random random = new Random();
        String num = random.nextInt(9999) + "";
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 7 - num.length(); i++) {
            buffer.append("0");
        }
        return buffer.toString() + num;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
