Select M.Bb_Msg_Id, M.Ce_Id, M.Msg_Typ_Id, M.Msg_Txt, M.Msg_Stat, M.Crt_Ts, M.Trans_Dt, S.Site_Status, O.Data_Integrity_Analyst, S.Site_Type
From Tb_Board_Msg M, V_Remedy_Site S, V_Remedy_Org O
Where M.Ce_Id = S.Ce_Id AND o.organization_id=s.organization_id
And M.Msg_Stat = 'O' 
And Msg_Typ_Id in (117, 64) 
And M.CRT_TS > sysdate -1
order by M.CRT_TS desc
