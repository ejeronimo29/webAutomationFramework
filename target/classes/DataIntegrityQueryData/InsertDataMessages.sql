 DECLARE

 BEGIN

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                75150/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                80028800/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                80024061/* SET SITE ID*/,
                0, 0, 64, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                80026118/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10288/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 64, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10093197/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                80029911/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 117, '$%TEt54LowCounts;$%$45gh', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 117, '*(%$jkjkHighCounts;;;;;64', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 117, '74832*()*ZeroCounts', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 117, 'NightCounts(*%($f', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);
  INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 64, '$%TEt54LowCounts;$%$45gh', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 64, '*(%$jkjkHighCounts;;;;;64', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 64, '74832*()*ZeroCounts', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 64, 'NightCounts(*%($f', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                10314/* SET SITE ID*/,
                0, 0, 64, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

 INSERT INTO TB_BOARD_MSG
               (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT)
             VALUES
               (BB_MSG_ID_SEQ.nextval, 0, 0, 0,
                80024061/* SET SITE ID*/,
                0, 0, 117, 'XFERProc;BslnVarEPs:1;BslnVarZns:TotPrp', 'O',
                SYSDATE + 1, TRUNC(SYSDATE),
                add_months(sysdate,7980*12), 'N', SYSDATE,
                SYSDATE, 'Y', 'IFACT',
                TRUNC(SYSDATE-1)/* SET TRANS DATE (if other than prior day) */);

Insert into TB_BOARD_MSG
                (BB_MSG_ID, HIST_CTRL, HIST_CNT_CTRL, HIST_REF_CTRL, CE_ID,
                HUB_ID, PPL_CNTR_ID, MSG_TYP_ID, MSG_TXT, MSG_STAT,
                EXP_TS, EFC_DT, END_DT, END_IND, CRT_TS,
                CMPL_TS, CMPL_IND, LGN_CD, TRANS_DT, SRC_FILE_NM)
            Values
                (bb_msg_id_seq.nextval, 0, 0, 0, 80024061, --ce_id 80029982
                238681, 444908, 26, 'OGW Old Data', 'O', -- hubid, pcid
                sysdate + 1, trunc(sysdate), TO_DATE('12/31/9999', 'MM/DD/YYYY'),
                'N', sysdate,
                sysdate, 'Y', 'WINDOWSINBOX',
                TRUNC(SYSDATE-60), -- trans_dt
                '0000238681.20170102.DAT');

END;