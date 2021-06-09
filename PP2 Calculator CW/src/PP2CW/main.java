package PP2CW;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class main extends Application
{
    Scene scn,scnMrtg,scnFin,scnLn,scnHlp;

    @Override
    public void start(Stage primaryStage)
    {

        primaryStage.setTitle("Financial Calculator App");

        AnchorPane window = new AnchorPane();

        scn = new Scene(window, 1000, 550);
        primaryStage.setScene(scn);
        primaryStage.show();

        Label lbl_titl = new Label("Financial Calculator App");
        lbl_titl.setLayoutX(290);
        lbl_titl.setLayoutY(40);
        lbl_titl.setStyle("-fx-alignment:center; -fx-font:bold 30px 'monospace';");

        Button btn_mrtCal = new Button("Mortgage Calculator");
        btn_mrtCal.setLayoutX(400);
        btn_mrtCal.setLayoutY(140);
        btn_mrtCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:lightseagreen; -fx-text-fill:white; -fx-font-size:18;");
        btn_mrtCal.setOnMouseEntered(event -> btn_mrtCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:greenyellow;-fx-font-size:18;"));
        btn_mrtCal.setOnMouseExited(event -> btn_mrtCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:lightseagreen;-fx-text-fill:white; -fx-font-size:18;"));


        Button btn_finCal = new Button("Finance Calculator");
        btn_finCal.setLayoutX(400);
        btn_finCal.setLayoutY(230);
        btn_finCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15;-fx-background-color:lightseagreen; -fx-text-fill:white; -fx-font-size:18;");
        btn_finCal.setOnMouseEntered(event -> btn_finCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:greenyellow; -fx-font-size:18;"));
        btn_finCal.setOnMouseExited(event -> btn_finCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:lightseagreen;-fx-text-fill:white; -fx-font-size:18;"));


        Button btn_lnCal = new Button("Auto Loan Calculator");
        btn_lnCal.setLayoutX(400);
        btn_lnCal.setLayoutY(320);
        btn_lnCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:lightseagreen; -fx-text-fill:white; -fx-font-size:18;");
        btn_lnCal.setOnMouseEntered(event -> btn_lnCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:greenyellow; -fx-font-size:18"));
        btn_lnCal.setOnMouseExited(event -> btn_lnCal.setStyle("-fx-min-width:210; -fx-min-height:55; -fx-background-radius:15; -fx-background-color:lightseagreen; -fx-text-fill:white; -fx-font-size:18;"));

        Button btn_hlp = new Button("Help");
        btn_hlp.setLayoutX(700);
        btn_hlp.setLayoutY(450);
        btn_hlp.setStyle("-fx-background-color:orange;-fx-min-width:140; -fx-min-height:35; -fx-font-size:17");

        window.getChildren().add(lbl_titl);
        window.getChildren().add(btn_mrtCal);
        window.getChildren().add(btn_lnCal);
        window.getChildren().add(btn_finCal);
        window.getChildren().add(btn_hlp);

        btn_mrtCal.setOnAction(event -> primaryStage.setScene(scnMrtg));
        btn_finCal.setOnAction(event -> primaryStage.setScene(scnFin));
        btn_lnCal.setOnAction(event -> primaryStage.setScene(scnLn));
        btn_hlp.setOnAction(event -> primaryStage.setScene(scnHlp));

        window.setStyle("-fx-background-color:mistyrose;");

        DecimalFormat decFrm = new DecimalFormat("###,###,##0.00");

        //----------------------------------------------------------Help---------------------------------------------------------------------------------------//

        AnchorPane rootHlp = new AnchorPane();

        scnHlp = new Scene(rootHlp,1000,550);

        Label lbl_hlp = new Label("Help");
        lbl_hlp.setLayoutX(450);
        lbl_hlp.setLayoutY(30);
        lbl_hlp.setStyle("-fx-alignment:center; -fx-font:bold 30px 'monospace';");

        Label lbl_ins1 = new Label("1) To access the needed calculator,click the appropriate button from the main window.");
        lbl_ins1.setLayoutX(140);
        lbl_ins1.setLayoutY(100);
        lbl_ins1.setStyle("-fx-font-size:18;");

        Label lbl_ins2 = new Label("2) In any calculator window,click on a textfield to get the popup keypad.");
        lbl_ins2.setLayoutX(140);
        lbl_ins2.setLayoutY(165);
        lbl_ins2.setStyle("-fx-font-size:18;");

        Label lbl_ins3 = new Label("3) By clicking the keypad buttons you can enter the details in textboxes.");
        lbl_ins3.setLayoutX(140);
        lbl_ins3.setLayoutY(230);
        lbl_ins3.setStyle("-fx-font-size:18;");

        Label lbl_ins4 = new Label("4) Click calculate button for calculate the result.");
        lbl_ins4.setLayoutX(140);
        lbl_ins4.setLayoutY(295);
        lbl_ins4.setStyle("-fx-font-size:18;");

        Button btn_bkHlp = new Button("Back");
        btn_bkHlp.setLayoutX(600);
        btn_bkHlp.setLayoutY(400);
        btn_bkHlp.setStyle("-fx-background-color:orange;-fx-min-width:140; -fx-min-height:35; -fx-font-size:17");
        btn_bkHlp.setOnAction(event -> primaryStage.setScene(scn));

        rootHlp.getChildren().add(lbl_hlp);
        rootHlp.getChildren().add(lbl_ins1);
        rootHlp.getChildren().add(lbl_ins2);
        rootHlp.getChildren().add(lbl_ins3);
        rootHlp.getChildren().add(lbl_ins4);
        rootHlp.getChildren().add(btn_bkHlp);

        rootHlp.setStyle("-fx-background-color:lavender");


        //----------------------------------------------------------Mortgage Calculator---------------------------------------------------------------------------------------//


        AnchorPane rootMrtg = new AnchorPane();

        Label lbl_ttl = new Label("Modify the values and click the Calculate button to use");
        lbl_ttl.setLayoutX(0);
        lbl_ttl.setLayoutY(8);
        lbl_ttl.setStyle("-fx-min-height:20; -fx-min-width:1000; -fx-alignment:center; -fx-background-color:blue; -fx-font:bold 20px 'verdana'; -fx-text-fill:white;");


        Label lbl_hmPrice = new Label("Home Price");
        lbl_hmPrice.setLayoutX(60);
        lbl_hmPrice.setLayoutY(80);

        TextField txt_hmPrice = new TextField();
        txt_hmPrice.setLayoutX(190);
        txt_hmPrice.setLayoutY(80);

        Label lbl_dwnPmnt = new Label("Down Payment ($)");
        lbl_dwnPmnt.setLayoutX(60);
        lbl_dwnPmnt.setLayoutY(140);

        TextField txt_dwnPmnt = new TextField();
        txt_dwnPmnt.setLayoutX(190);
        txt_dwnPmnt.setLayoutY(140);

        ComboBox cb_dp = new ComboBox();
        cb_dp.getItems().addAll("$", "%");
        cb_dp.setLayoutX(380);
        cb_dp.setLayoutY(140);

        Label lbl_loanTrm = new Label("Loan Term");
        lbl_loanTrm.setLayoutX(60);
        lbl_loanTrm.setLayoutY(200);

        TextField txt_loanTrm = new TextField();
        txt_loanTrm.setLayoutX(190);
        txt_loanTrm.setLayoutY(200);

        Label lbl_yrs = new Label("years");
        lbl_yrs.setLayoutX(380);
        lbl_yrs.setLayoutY(206);

        Label lbl_intRate = new Label("Interest Rate ($)");
        lbl_intRate.setLayoutX(60);
        lbl_intRate.setLayoutY(260);

        TextField txt_intRate = new TextField();
        txt_intRate.setLayoutX(190);
        txt_intRate.setLayoutY(260);

        Button btn_bk1 = new Button("Back");
        btn_bk1.setLayoutX(80);
        btn_bk1.setLayoutY(430);
        btn_bk1.setStyle("-fx-background-color:tomato; -fx-min-width:130; -fx-font:normal bold 18px 'serif'; -fx-text-fill:white;");
        btn_bk1.setOnAction(event -> primaryStage.setScene(scn));

        Button btn_cal = new Button("Calculate");
        btn_cal.setLayoutX(280);
        btn_cal.setLayoutY(430);
        btn_cal.setStyle("-fx-background-color:forestgreen; -fx-min-width:160; -fx-font:normal bold 18px 'serif'; -fx-text-fill:white;");

        Label lbl_mnthPay = new Label("Monthly Pay:");
        lbl_mnthPay.setLayoutX(550);
        lbl_mnthPay.setLayoutY(70);
        lbl_mnthPay.setStyle("-fx-background-color:yellowgreen; -fx-font-size:20; -fx-min-width:410 ");

        Label lbl_hsPrice = new Label("House Price");
        lbl_hsPrice.setLayoutX(550);
        lbl_hsPrice.setLayoutY(140);
        lbl_hsPrice.setStyle("-fx-background-color:gainsboro; -fx-min-width:230;");

        Label lbl_hsPriceTotl = new Label("");
        lbl_hsPriceTotl.setLayoutX(840);
        lbl_hsPriceTotl.setLayoutY(140);
        lbl_hsPriceTotl.setStyle("-fx-background-color:gainsboro; -fx-min-width:120; -fx-alignment:center-right;");

        Label lbl_loanAmnt = new Label("Loan Amount");
        lbl_loanAmnt.setLayoutX(550);
        lbl_loanAmnt.setLayoutY(190);
        lbl_loanAmnt.setStyle("-fx-background-color:gainsboro; -fx-min-width:230;");

        Label lbl_loanAmntTotl = new Label("");
        lbl_loanAmntTotl.setLayoutX(840);
        lbl_loanAmntTotl.setLayoutY(190);
        lbl_loanAmntTotl.setStyle("-fx-background-color:gainsboro; -fx-min-width:120; -fx-alignment:center-right;");

        Label lbl_downPmnt = new Label("Down Payment");
        lbl_downPmnt.setLayoutX(550);
        lbl_downPmnt.setLayoutY(240);
        lbl_downPmnt.setStyle("-fx-background-color:gainsboro; -fx-min-width:230;");

        Label lbl_downPmntTotl = new Label("");
        lbl_downPmntTotl.setLayoutX(840);
        lbl_downPmntTotl.setLayoutY(240);
        lbl_downPmntTotl.setStyle("-fx-background-color:gainsboro; -fx-min-width:120; -fx-alignment:center-right;");

        Label lbl_ttlMrtPay = new Label("Total of .... Mortgage Payments");
        lbl_ttlMrtPay.setLayoutX(550);
        lbl_ttlMrtPay.setLayoutY(290);
        lbl_ttlMrtPay.setStyle("-fx-background-color:gainsboro; -fx-min-width:230;");

        Label lbl_ttlMrtPayTotl = new Label("");
        lbl_ttlMrtPayTotl.setLayoutX(840);
        lbl_ttlMrtPayTotl.setLayoutY(290);
        lbl_ttlMrtPayTotl.setStyle("-fx-background-color:gainsboro; -fx-min-width:120; -fx-alignment:center-right;");

        Label lbl_ttlInt = new Label("Total Interest");
        lbl_ttlInt.setLayoutX(550);
        lbl_ttlInt.setLayoutY(340);
        lbl_ttlInt.setStyle("-fx-background-color:gainsboro; -fx-min-width:230;");

        Label lbl_ttlIntTotl = new Label("");
        lbl_ttlIntTotl.setLayoutX(840);
        lbl_ttlIntTotl.setLayoutY(340);
        lbl_ttlIntTotl.setStyle("-fx-background-color:gainsboro; -fx-min-width:120; -fx-alignment:center-right;");


        btn_cal.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {

                int lnTrmMnths = Integer.parseInt(txt_loanTrm.getText()) * 12;
                lbl_ttlMrtPay.setText("Total of " + lnTrmMnths + " Mortgage Payments");
                double ttl_Price = Double.parseDouble(txt_hmPrice.getText());
                double dwn_Pay;

                if (cb_dp.getValue().equals("%"))
                {
                    dwn_Pay = Double.parseDouble(txt_hmPrice.getText()) * Double.parseDouble(txt_dwnPmnt.getText()) * 0.01;
                } else
                    {
                    dwn_Pay = Double.parseDouble(txt_dwnPmnt.getText());
                }

                double P = ttl_Price - dwn_Pay;
                double ln_Trm = Double.parseDouble(txt_loanTrm.getText());
                double n = ln_Trm * 12;

                double int_Rate = Double.parseDouble(txt_intRate.getText()) * 0.01;
                double r = int_Rate / 12;

                double A = (P * r * Math.pow(( 1 + r), n)) / (Math.pow(( 1 + r), n) - 1);

                lbl_mnthPay.setText("Monthly Pay :                    $ " + decFrm.format(A));
                lbl_hsPriceTotl.setText("$ " + decFrm.format(ttl_Price));
                lbl_loanAmntTotl.setText("$ " + decFrm.format(P));
                lbl_downPmntTotl.setText("$ " + decFrm.format(dwn_Pay));
                lbl_ttlMrtPayTotl.setText("$ " + decFrm.format(A * lnTrmMnths));
                lbl_ttlIntTotl.setText("$ " + decFrm.format(A * lnTrmMnths - P));

            }
        });


        rootMrtg.getChildren().add(lbl_ttl);
        rootMrtg.getChildren().add(lbl_hmPrice);
        rootMrtg.getChildren().add(txt_hmPrice);
        rootMrtg.getChildren().add(lbl_dwnPmnt);
        rootMrtg.getChildren().add(txt_dwnPmnt);
        rootMrtg.getChildren().add(cb_dp);
        rootMrtg.getChildren().add(lbl_loanTrm);
        rootMrtg.getChildren().add(txt_loanTrm);
        rootMrtg.getChildren().add(lbl_yrs);
        rootMrtg.getChildren().add(lbl_intRate);
        rootMrtg.getChildren().add(txt_intRate);
        rootMrtg.getChildren().add(btn_cal);
        rootMrtg.getChildren().add(btn_bk1);
        rootMrtg.getChildren().add(lbl_mnthPay);
        rootMrtg.getChildren().add(lbl_hsPrice);
        rootMrtg.getChildren().add(lbl_hsPriceTotl);
        rootMrtg.getChildren().add(lbl_loanAmnt);
        rootMrtg.getChildren().add(lbl_loanAmntTotl);
        rootMrtg.getChildren().add(lbl_downPmnt);
        rootMrtg.getChildren().add(lbl_downPmntTotl);
        rootMrtg.getChildren().add(lbl_ttlMrtPay);
        rootMrtg.getChildren().add(lbl_ttlMrtPayTotl);
        rootMrtg.getChildren().add(lbl_ttlInt);
        rootMrtg.getChildren().add(lbl_ttlIntTotl);

        keypad(txt_hmPrice,rootMrtg);
        keypad(txt_dwnPmnt,rootMrtg);
        keypad(txt_loanTrm,rootMrtg);
        keypad(txt_intRate,rootMrtg);

        rootMrtg.setStyle("-fx-background-color:wheat;");

        scnMrtg = new Scene(rootMrtg, 1000, 800);


        //----------------------------------------------------------Finance Calculator---------------------------------------------------------------------------------------//


        AnchorPane rootFin = new AnchorPane();

        Label lbl_title = new Label("Modify the values and click the Calculate button to use");
        lbl_title.setLayoutX(0);
        lbl_title.setLayoutY(8);
        lbl_title.setStyle("-fx-min-height:20; -fx-min-width:1000; -fx-alignment:center; -fx-background-color:blue; -fx-font:bold 20px 'verdana'; -fx-text-fill:white;");

        Label lbl_numPrds = new Label("N (# of periods)");
        lbl_numPrds.setLayoutX(95);
        lbl_numPrds.setLayoutY(65);

        TextField txt_numPrds = new TextField();
        txt_numPrds.setLayoutX(210);
        txt_numPrds.setLayoutY(65);

        Label lbl_strtPrnc = new Label("Start Principal ($)");
        lbl_strtPrnc.setLayoutX(90);
        lbl_strtPrnc.setLayoutY(120);

        TextField txt_strtPrnc = new TextField();
        txt_strtPrnc.setLayoutX(210);
        txt_strtPrnc.setLayoutY(120);

        Label lbl_iy = new Label("I/Y (Interest) ($)");
        lbl_iy.setLayoutX(100);
        lbl_iy.setLayoutY(175);

        TextField txt_iy = new TextField();
        txt_iy.setLayoutX(210);
        txt_iy.setLayoutY(175);

        Label lbl_pmt = new Label("PMT (Annuity Payment) ($)");
        lbl_pmt.setLayoutX(25);
        lbl_pmt.setLayoutY(230);

        TextField txt_pmt = new TextField();
        txt_pmt.setLayoutX(210);
        txt_pmt.setLayoutY(230);

        Label lbl_fuv = new Label("FV (Future Value) ($)");
        lbl_fuv.setLayoutX(70);
        lbl_fuv.setLayoutY(285);

        TextField txt_fuv = new TextField();
        txt_fuv.setLayoutX(210);
        txt_fuv.setLayoutY(285);

        Label lbl_radPmt = new Label("PMT made at the ");
        lbl_radPmt.setLayoutX(40);
        lbl_radPmt.setLayoutY(340);

        RadioButton rb_bgn = new RadioButton("beginning");
        rb_bgn.setLayoutX(180);
        rb_bgn.setLayoutY(340);

        RadioButton rb_end = new RadioButton("end");
        rb_end.setLayoutX(300);
        rb_end.setLayoutY(340);

        Label lbl_cmPrd = new Label("of each compound period");
        lbl_cmPrd.setLayoutX(160);
        lbl_cmPrd.setLayoutY(365);

        Button btn_bk2 = new Button("Back");
        btn_bk2.setLayoutX(80);
        btn_bk2.setLayoutY(450);
        btn_bk2.setStyle("-fx-background-color:tomato; -fx-min-width:130; -fx-font:normal bold 18px 'serif'; -fx-text-fill:white;");
        btn_bk2.setOnAction(event -> primaryStage.setScene(scn));

        Button btn_calc = new Button("Calculate");
        btn_calc.setLayoutX(240);
        btn_calc.setLayoutY(450);
        btn_calc.setStyle("-fx-background-color:forestgreen; -fx-min-width:160; -fx-font:normal bold 18px 'serif'; -fx-text-fill:white;");

        Label lbl_rslt = new Label("Results");
        lbl_rslt.setLayoutX(480);
        lbl_rslt.setLayoutY(60);
        lbl_rslt.setStyle("-fx-background-color:forestgreen; -fx-min-width:380; -fx-font-size:20; -fx-text-fill:white;");

        Label lbl_fv = new Label("FV (Future Value)");
        lbl_fv.setLayoutX(480);
        lbl_fv.setLayoutY(110);
        lbl_fv.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_fv2 = new Label("10.00");
        lbl_fv2.setLayoutX(760);
        lbl_fv2.setLayoutY(110);
        lbl_fv2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100;-fx-alignment:center-right;");

        Label lbl_pv = new Label("PV (Present Value)");
        lbl_pv.setLayoutX(480);
        lbl_pv.setLayoutY(150);
        lbl_pv.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_pv2 = new Label("10,000");
        lbl_pv2.setLayoutX(760);
        lbl_pv2.setLayoutY(150);
        lbl_pv2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100; -fx-alignment:center-right;");

        Label lbl_n = new Label("N (Number of Periods)");
        lbl_n.setLayoutX(480);
        lbl_n.setLayoutY(190);
        lbl_n.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_n2 = new Label("$1000.00");
        lbl_n2.setLayoutX(760);
        lbl_n2.setLayoutY(190);
        lbl_n2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100;-fx-alignment:center-right;");

        Label lbl_intRt = new Label("I/Y (Interest Rate)");
        lbl_intRt.setLayoutX(480);
        lbl_intRt.setLayoutY(230);
        lbl_intRt.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_intRt2 = new Label("");
        lbl_intRt2.setLayoutX(760);
        lbl_intRt2.setLayoutY(230);
        lbl_intRt2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100;-fx-alignment:center-right;");

        Label lbl_prdPay = new Label("PMT (Periodic Payment)");
        lbl_prdPay.setLayoutX(480);
        lbl_prdPay.setLayoutY(270);
        lbl_prdPay.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_prdPay2 = new Label("");
        lbl_prdPay2.setLayoutX(760);
        lbl_prdPay2.setLayoutY(270);
        lbl_prdPay2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100;-fx-alignment:center-right;");

        Label lbl_strInv = new Label("Starting Investment");
        lbl_strInv.setLayoutX(480);
        lbl_strInv.setLayoutY(310);
        lbl_strInv.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_strInv2 = new Label("");
        lbl_strInv2.setLayoutX(760);
        lbl_strInv2.setLayoutY(310);
        lbl_strInv2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100;-fx-alignment:center-right;");

        Label lbl_totlPrnc = new Label("Total Principal");
        lbl_totlPrnc.setLayoutX(480);
        lbl_totlPrnc.setLayoutY(350);
        lbl_totlPrnc.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_totlPrnc2 = new Label("");
        lbl_totlPrnc2.setLayoutX(760);
        lbl_totlPrnc2.setLayoutY(350);
        lbl_totlPrnc2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100;-fx-alignment:center-right;");

        Label lbl_totlInt = new Label("Total Interest");
        lbl_totlInt.setLayoutX(480);
        lbl_totlInt.setLayoutY(390);
        lbl_totlInt.setStyle("-fx-background-color:gainsboro; -fx-min-width:260;");

        Label lbl_totlInt2 = new Label("");
        lbl_totlInt2.setLayoutX(760);
        lbl_totlInt2.setLayoutY(390);
        lbl_totlInt2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100;-fx-alignment:center-right;");


        rootFin.getChildren().add(lbl_title);
        rootFin.getChildren().add(lbl_numPrds);
        rootFin.getChildren().add(txt_numPrds);
        rootFin.getChildren().add(lbl_strtPrnc);
        rootFin.getChildren().add(txt_strtPrnc);
        rootFin.getChildren().add(lbl_iy);
        rootFin.getChildren().add(txt_iy);
        rootFin.getChildren().add(lbl_pmt);
        rootFin.getChildren().add(txt_pmt);
        rootFin.getChildren().add(lbl_fuv);
        rootFin.getChildren().add(txt_fuv);
        rootFin.getChildren().add(lbl_radPmt);
        rootFin.getChildren().add(rb_bgn);
        rootFin.getChildren().add(rb_end);
        rootFin.getChildren().add(lbl_cmPrd);
        rootFin.getChildren().add(btn_bk2);
        rootFin.getChildren().add(btn_calc);
        rootFin.getChildren().add(lbl_rslt);
        rootFin.getChildren().add(lbl_fv);
        rootFin.getChildren().add(lbl_fv2);
        rootFin.getChildren().add(lbl_pv);
        rootFin.getChildren().add(lbl_pv2);
        rootFin.getChildren().add(lbl_n);
        rootFin.getChildren().add(lbl_n2);
        rootFin.getChildren().add(lbl_intRt);
        rootFin.getChildren().add(lbl_intRt2);
        rootFin.getChildren().add(lbl_prdPay);
        rootFin.getChildren().add(lbl_prdPay2);
        rootFin.getChildren().add(lbl_strInv);
        rootFin.getChildren().add(lbl_strInv2);
        rootFin.getChildren().add(lbl_totlPrnc);
        rootFin.getChildren().add(lbl_totlPrnc2);
        rootFin.getChildren().add(lbl_totlInt);
        rootFin.getChildren().add(lbl_totlInt2);

        keypad(txt_numPrds,rootFin);
        keypad(txt_strtPrnc,rootFin);
        keypad(txt_iy,rootFin);
        keypad(txt_pmt,rootFin);
        keypad(txt_fuv,rootFin);


        rootFin.setStyle("-fx-background-color:wheat;");

        scnFin = new Scene(rootFin, 1000, 800);

        //----------------------------------------------------------Auto Loan Calculator---------------------------------------------------------------------------------------//


        AnchorPane rootAutLn = new AnchorPane();

        Label lbl_ttle = new Label("Modify the values and click the Calculate button to use");
        lbl_ttle.setLayoutX(0);
        lbl_ttle.setLayoutY(8);
        lbl_ttle.setStyle("-fx-min-height:20; -fx-min-width:1000; -fx-alignment:center; -fx-background-color:blue; -fx-font:bold 20px 'verdana'; -fx-text-fill:white;");

        Label lbl_autPrc = new Label("Auto Price");
        lbl_autPrc.setLayoutX(60);
        lbl_autPrc.setLayoutY(55);

        TextField txt_autPrc = new TextField("");
        txt_autPrc.setLayoutX(190);
        txt_autPrc.setLayoutY(55);

        Label lbl_lnTrm = new Label("Loan Term (months)");
        lbl_lnTrm.setLayoutX(60);
        lbl_lnTrm.setLayoutY(105);

        TextField txt_lnTrm = new TextField("");
        txt_lnTrm.setLayoutX(190);
        txt_lnTrm.setLayoutY(105);

        Label lbl_intRte = new Label("Interest Rate (%)");
        lbl_intRte.setLayoutX(60);
        lbl_intRte.setLayoutY(155);

        TextField txt_intRt = new TextField("");
        txt_intRt.setLayoutX(190);
        txt_intRt.setLayoutY(155);

        Label lbl_dwnPay = new Label("Down Payment");
        lbl_dwnPay.setLayoutX(60);
        lbl_dwnPay.setLayoutY(205);

        TextField txt_dwnPay = new TextField("");
        txt_dwnPay.setLayoutX(190);
        txt_dwnPay.setLayoutY(205);

        Label lbl_trdVal = new Label("Trade-in Value");
        lbl_trdVal.setLayoutX(60);
        lbl_trdVal.setLayoutY(255);

        TextField txt_trdVal = new TextField("");
        txt_trdVal.setLayoutX(190);
        txt_trdVal.setLayoutY(255);

        Label lbl_slTax = new Label("Sales Tax (%)");
        lbl_slTax.setLayoutX(60);
        lbl_slTax.setLayoutY(305);

        TextField txt_slTax = new TextField("");
        txt_slTax.setLayoutX(190);
        txt_slTax.setLayoutY(305);

        Label lbl_ttlReg = new Label("Title,Registration");
        lbl_ttlReg.setLayoutX(60);
        lbl_ttlReg.setLayoutY(355);

        Label lbl_othFee = new Label("and Other Fees");
        lbl_othFee.setLayoutX(60);
        lbl_othFee.setLayoutY(371);

        TextField txt_trof = new TextField("");
        txt_trof.setLayoutX(190);
        txt_trof.setLayoutY(355);

        CheckBox chekBox = new CheckBox("Include All Fees in Loan");
        chekBox.setLayoutX(60);
        chekBox.setLayoutY(410);
        chekBox.setStyle("-fx-font:normal bold 18px 'serif';");

        Button btn_bk3 = new Button("Back");
        btn_bk3.setLayoutX(80);
        btn_bk3.setLayoutY(480);
        btn_bk3.setStyle("-fx-background-color:tomato; -fx-min-width:130; -fx-font:normal bold 18px 'serif'; -fx-text-fill:white;");
        btn_bk3.setOnAction(event -> primaryStage.setScene(scn));

        Button btn_calcl = new Button("Calculate");
        btn_calcl.setLayoutX(240);
        btn_calcl.setLayoutY(480);
        btn_calcl.setStyle("-fx-background-color:forestgreen; -fx-min-width:160; -fx-font:normal bold 18px 'serif'; -fx-text-fill:white;");

        Label lbl_mnthlPay = new Label("Monthly Pay:");
        lbl_mnthlPay.setLayoutX(460);
        lbl_mnthlPay.setLayoutY(60);
        lbl_mnthlPay.setStyle("-fx-background-color:forestgreen;-fx-font-size:20; -fx-min-width:440; -fx-text-fill:white;");

        Label lbl_ttlLnAmnt = new Label("Total Loan Amount");
        lbl_ttlLnAmnt.setLayoutX(460);
        lbl_ttlLnAmnt.setLayoutY(110);

        Label lbl_ttlLnAmnt2 = new Label("");
        lbl_ttlLnAmnt2.setLayoutX(800);
        lbl_ttlLnAmnt2.setLayoutY(110);
        lbl_ttlLnAmnt2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100; -fx-alignment:center-right;");

        Label lbl_slTx = new Label("Sale Tax");
        lbl_slTx.setLayoutX(460);
        lbl_slTx.setLayoutY(160);

        Label lbl_slTx2 = new Label("");
        lbl_slTx2.setLayoutX(800);
        lbl_slTx2.setLayoutY(160);
        lbl_slTx2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100; -fx-alignment:center-right;");

        Label lbl_upfPay = new Label("Upfront Payment");
        lbl_upfPay.setLayoutX(460);
        lbl_upfPay.setLayoutY(210);

        Label lbl_upfPay2 = new Label("");
        lbl_upfPay2.setLayoutX(800);
        lbl_upfPay2.setLayoutY(210);
        lbl_upfPay2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100; -fx-alignment:center-right;");

        Label lbl_ttlLnPay = new Label("Total of .... Loan Payments");
        lbl_ttlLnPay.setLayoutX(460);
        lbl_ttlLnPay.setLayoutY(260);

        Label lbl_ttlLnPay2 = new Label("");
        lbl_ttlLnPay2.setLayoutX(800);
        lbl_ttlLnPay2.setLayoutY(260);
        lbl_ttlLnPay2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100; -fx-alignment:center-right;");

        Label lbl_ttlLnInt = new Label("Total Loan Interest");
        lbl_ttlLnInt.setLayoutX(460);
        lbl_ttlLnInt.setLayoutY(310);

        Label lbl_ttlLnInt2 = new Label("");
        lbl_ttlLnInt2.setLayoutX(800);
        lbl_ttlLnInt2.setLayoutY(310);
        lbl_ttlLnInt2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100; -fx-alignment:center-right;");

        Label lbl_ttlCst = new Label("Total Cost (price, interest, tax, fees)");
        lbl_ttlCst.setLayoutX(460);
        lbl_ttlCst.setLayoutY(360);

        Label lbl_ttlCst2 = new Label("");
        lbl_ttlCst2.setLayoutX(800);
        lbl_ttlCst2.setLayoutY(360);
        lbl_ttlCst2.setStyle("-fx-background-color:gainsboro; -fx-min-width:100; -fx-alignment:center-right;");

        btn_calcl.setOnAction(new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event)
            {

                lbl_ttlLnPay.setText("Total of " + txt_lnTrm.getText() + " Loan Payments");

                double aut_Prc = Double.parseDouble(txt_autPrc.getText());
                double ln_Trm = Double.parseDouble(txt_lnTrm.getText());
                double int_Rt = Double.parseDouble(txt_intRt.getText());
                double down_Pay = Double.parseDouble(txt_dwnPay.getText());
                double trd_Val = Double.parseDouble(txt_trdVal.getText());
                double loan_pV = aut_Prc - down_Pay - trd_Val;
                double ln_rt = (int_Rt * 0.01) / 12;

                double PMT;

                PMT = (loan_pV * ln_rt * Math.pow((1 + ln_rt), ln_Trm)) / (Math.pow((1 + ln_rt), ln_Trm) - 1);

                lbl_mnthlPay.setText(" Monthly Pay:                  $" + decFrm.format(PMT));
                lbl_ttlLnAmnt2.setText("$ " + decFrm.format(loan_pV));

                double sls_Tx_Prcntg = Double.parseDouble(txt_slTax.getText()) * 0.01;
                double sls_Tax = (aut_Prc - trd_Val) * sls_Tx_Prcntg;
                lbl_slTx2.setText("$ " + decFrm.format(sls_Tax));

                double tROF = Double.parseDouble(txt_trof.getText());
                lbl_upfPay2.setText("$ " + decFrm.format(down_Pay + tROF + sls_Tax));

                double mnths = Double.parseDouble(txt_lnTrm.getText());
                double ttlMnths = PMT * mnths;

                lbl_ttlLnPay2.setText("$ " + decFrm.format(ttlMnths));
                lbl_ttlLnInt2.setText("$ " + decFrm.format(ttlMnths - loan_pV));
                lbl_ttlCst2.setText("$ " + decFrm.format(aut_Prc + (ttlMnths - loan_pV) + sls_Tax + tROF));

            }
        });

        rootAutLn.getChildren().add(lbl_ttle);
        rootAutLn.getChildren().add(lbl_autPrc);
        rootAutLn.getChildren().add(txt_autPrc);
        rootAutLn.getChildren().add(lbl_lnTrm);
        rootAutLn.getChildren().add(txt_lnTrm);
        rootAutLn.getChildren().add(lbl_intRte);
        rootAutLn.getChildren().add(txt_intRt);
        rootAutLn.getChildren().add(lbl_dwnPay);
        rootAutLn.getChildren().add(txt_dwnPay);
        rootAutLn.getChildren().add(lbl_trdVal);
        rootAutLn.getChildren().add(txt_trdVal);
        rootAutLn.getChildren().add(lbl_slTax);
        rootAutLn.getChildren().add(txt_slTax);
        rootAutLn.getChildren().add(lbl_ttlReg);
        rootAutLn.getChildren().add(lbl_othFee);
        rootAutLn.getChildren().add(txt_trof);
        rootAutLn.getChildren().add(chekBox);
        rootAutLn.getChildren().add(btn_calcl);
        rootAutLn.getChildren().add(btn_bk3);
        rootAutLn.getChildren().add(lbl_mnthlPay);
        rootAutLn.getChildren().add(lbl_ttlLnAmnt);
        rootAutLn.getChildren().add(lbl_ttlLnAmnt2);
        rootAutLn.getChildren().add(lbl_slTx);
        rootAutLn.getChildren().add(lbl_slTx2);
        rootAutLn.getChildren().add(lbl_upfPay);
        rootAutLn.getChildren().add(lbl_upfPay2);
        rootAutLn.getChildren().add(lbl_ttlLnPay);
        rootAutLn.getChildren().add(lbl_ttlLnPay2);
        rootAutLn.getChildren().add(lbl_ttlLnInt);
        rootAutLn.getChildren().add(lbl_ttlLnInt2);
        rootAutLn.getChildren().add(lbl_ttlCst);
        rootAutLn.getChildren().add(lbl_ttlCst2);

        keypad(txt_autPrc,rootAutLn);
        keypad(txt_lnTrm,rootAutLn);
        keypad(txt_intRt,rootAutLn);
        keypad(txt_dwnPay,rootAutLn);
        keypad(txt_trdVal,rootAutLn);
        keypad(txt_slTax,rootAutLn);
        keypad(txt_trof,rootAutLn);

        rootAutLn.setStyle("-fx-background-color:wheat;");

        scnLn = new Scene(rootAutLn, 1000, 800);
    }

        //----------------------------------------------------------Popup Keypad---------------------------------------------------------------------------------------//


        public static void keypad(TextField a, AnchorPane ap_Kp)
        {
        a.setOnMousePressed(new javafx.event.EventHandler<MouseEvent>()
        {

            @Override
            public void handle(MouseEvent event)
            {

                Button btn_kp1 = new Button("1");
                btn_kp1.setLayoutX(600);
                btn_kp1.setLayoutY(480);
                btn_kp1.setPrefSize(45, 45);
                btn_kp1.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp1.setOnMouseEntered(event1 -> btn_kp1.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp1.setOnMouseExited(event1 -> btn_kp1.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp1.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "1");
                    }
                });

                Button btn_kp2 = new Button("2");
                btn_kp2.setLayoutX(660);
                btn_kp2.setLayoutY(480);
                btn_kp2.setPrefSize(45, 45);
                btn_kp2.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp2.setOnMouseEntered(event1 -> btn_kp2.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp2.setOnMouseExited(event1 -> btn_kp2.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp2.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "2");
                    }
                });


                Button btn_kp3 = new Button("3");
                btn_kp3.setLayoutX(720);
                btn_kp3.setLayoutY(480);
                btn_kp3.setPrefSize(45, 45);
                btn_kp3.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp3.setOnMouseEntered(event1 -> btn_kp3.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp3.setOnMouseExited(event1 -> btn_kp3.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp3.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "3");
                    }
                });


                Button btn_kp4 = new Button("4");
                btn_kp4.setLayoutX(600);
                btn_kp4.setLayoutY(540);
                btn_kp4.setPrefSize(45, 45);
                btn_kp4.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp4.setOnMouseEntered(event1 -> btn_kp4.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp4.setOnMouseExited(event1 -> btn_kp4.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp4.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "4");
                    }
                });


                Button btn_kp5 = new Button("5");
                btn_kp5.setLayoutX(660);
                btn_kp5.setLayoutY(540);
                btn_kp5.setPrefSize(45, 45);
                btn_kp5.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp5.setOnMouseEntered(event1 -> btn_kp5.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp5.setOnMouseExited(event1 -> btn_kp5.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp5.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "5");
                    }
                });


                Button btn_kp6 = new Button("6");
                btn_kp6.setLayoutX(720);
                btn_kp6.setLayoutY(540);
                btn_kp6.setPrefSize(45, 45);
                btn_kp6.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp6.setOnMouseEntered(event1 -> btn_kp6.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp6.setOnMouseExited(event1 -> btn_kp6.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp6.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "6");
                    }
                });


                Button btn_kp7 = new Button("7");
                btn_kp7.setLayoutX(600);
                btn_kp7.setLayoutY(600);
                btn_kp7.setPrefSize(45, 45);
                btn_kp7.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp7.setOnMouseEntered(event1 -> btn_kp7.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp7.setOnMouseExited(event1 -> btn_kp7.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp7.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "7");
                    }
                });


                Button btn_kp8 = new Button("8");
                btn_kp8.setLayoutX(660);
                btn_kp8.setLayoutY(600);
                btn_kp8.setPrefSize(45, 45);
                btn_kp8.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp8.setOnMouseEntered(event1 -> btn_kp8.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp8.setOnMouseExited(event1 -> btn_kp8.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp8.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "8");
                    }
                });


                Button btn_kp9 = new Button("9");
                btn_kp9.setLayoutX(720);
                btn_kp9.setLayoutY(600);
                btn_kp9.setPrefSize(45, 45);
                btn_kp9.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp9.setOnMouseEntered(event1 -> btn_kp9.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp9.setOnMouseExited(event1 -> btn_kp9.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp9.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "9");
                    }
                });


                Button btn_kpClr = new Button("←");
                btn_kpClr.setLayoutX(600);
                btn_kpClr.setLayoutY(660);
                btn_kpClr.setPrefSize(45, 45);
                btn_kpClr.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kpClr.setOnMouseEntered(event1 -> btn_kpClr.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kpClr.setOnMouseExited(event1 -> btn_kpClr.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kpClr.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text.substring(0, text.length()-1));
                    }
                });


                Button btn_kp0 = new Button("0");
                btn_kp0.setLayoutX(660);
                btn_kp0.setLayoutY(660);
                btn_kp0.setPrefSize(45, 45);
                btn_kp0.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kp0.setOnMouseEntered(event1 -> btn_kp0.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kp0.setOnMouseExited(event1 -> btn_kp0.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kp0.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + "0");
                    }
                });


                Button btn_kpDot = new Button(".");
                btn_kpDot.setLayoutX(720);
                btn_kpDot.setLayoutY(660);
                btn_kpDot.setPrefSize(45, 45);
                btn_kpDot.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;");
                btn_kpDot.setOnMouseEntered(event1 -> btn_kpDot.setStyle("-fx-background-radius:10; -fx-font-size:15;-fx-background-color:blueviolet; -fx-text-fill:white"));
                btn_kpDot.setOnMouseExited(event1 -> btn_kpDot.setStyle("-fx-background-radius:10; -fx-font-size:15; -fx-background-color:lawngreen;"));

                btn_kpDot.setOnAction(new EventHandler<ActionEvent>()
                {
                    @Override
                    public void handle(ActionEvent event)
                    {
                        String text = a.getText();
                        a.setText(text + ".");
                    }
                });

                ap_Kp.getChildren().add(btn_kp1);
                ap_Kp.getChildren().add(btn_kp2);
                ap_Kp.getChildren().add(btn_kp3);
                ap_Kp.getChildren().add(btn_kp4);
                ap_Kp.getChildren().add(btn_kp5);
                ap_Kp.getChildren().add(btn_kp6);
                ap_Kp.getChildren().add(btn_kp7);
                ap_Kp.getChildren().add(btn_kp8);
                ap_Kp.getChildren().add(btn_kp9);
                ap_Kp.getChildren().add(btn_kpClr);
                ap_Kp.getChildren().add(btn_kp0);
                ap_Kp.getChildren().add(btn_kpDot);

            }
        });
        }
    public static void main(String[] args)
    {
        launch(args);
    }

}
