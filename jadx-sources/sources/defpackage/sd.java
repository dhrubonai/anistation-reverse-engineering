package defpackage;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sd implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ String y;
    public final /* synthetic */ Object z;

    public /* synthetic */ sd(vr4 vr4Var, sb2 sb2Var, yr4 yr4Var, String str, ia3 ia3Var) {
        this.z = vr4Var;
        this.A = sb2Var;
        this.B = yr4Var;
        this.y = str;
        this.C = ia3Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        ExposedFunction invoke$lambda$0;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj = this.C;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        String str = this.y;
        switch (b) {
            case 0:
                ((vr4) obj4).o((sb2) obj3, (yr4) obj2, str, (ia3) obj);
                return pn6Var;
            case 1:
                invoke$lambda$0 = HandleInvocationsFromAdViewer.invoke$lambda$0((HandleInvocationsFromAdViewer) obj4, str, (String) obj3, (String) obj2, (AdObject) obj);
                return invoke$lambda$0;
            default:
                String str2 = (String) obj4;
                ic2 ic2Var = (ic2) obj3;
                w44 w44Var = (w44) obj2;
                w44 w44Var2 = (w44) obj;
                if (((String) w44Var.getValue()).length() == 0) {
                    si siVar = si.a;
                    si.a(str);
                } else if (((String) w44Var2.getValue()).length() == 0) {
                    si siVar2 = si.a;
                    si.a(str2);
                } else {
                    ic2Var.invoke((String) w44Var.getValue(), (String) w44Var2.getValue());
                }
                return pn6Var;
        }
    }

    public /* synthetic */ sd(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        this.z = handleInvocationsFromAdViewer;
        this.y = str;
        this.A = str2;
        this.B = str3;
        this.C = adObject;
    }

    public /* synthetic */ sd(String str, String str2, ic2 ic2Var, w44 w44Var, w44 w44Var2) {
        this.y = str;
        this.z = str2;
        this.A = ic2Var;
        this.B = w44Var;
        this.C = w44Var2;
    }
}
