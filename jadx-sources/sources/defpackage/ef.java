package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ef implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ w44 y;

    public /* synthetic */ ef(w44 w44Var, byte b) {
        this.x = b;
        this.y = w44Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        ko koVar;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.y;
        switch (b) {
            case 0:
                w44Var.setValue((ha3) obj);
                return pn6Var;
            case 1:
                w44Var.setValue((ha3) obj);
                return pn6Var;
            case 2:
                h86 h86Var = (h86) obj;
                if (h86Var.c) {
                    koVar = h86Var.b;
                } else {
                    koVar = h86Var.a;
                }
                w44Var.setValue(koVar);
                return pn6Var;
            case 3:
                List list = (List) obj;
                if (w44Var != null) {
                    w44Var.setValue(list);
                }
                return pn6Var;
            case 4:
                cw1 cw1Var = (cw1) obj;
                cw1Var.getClass();
                w44Var.setValue(cw1Var);
                return pn6Var;
            case 5:
                String str = (String) obj;
                str.getClass();
                w44Var.setValue(str);
                return pn6Var;
            case 6:
                bw1 bw1Var = (bw1) obj;
                bw1Var.getClass();
                w44Var.setValue(bw1Var);
                return pn6Var;
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                w44Var.setValue(str2);
                return pn6Var;
            case 8:
                bw1 bw1Var2 = (bw1) obj;
                bw1Var2.getClass();
                w44Var.setValue(bw1Var2);
                return pn6Var;
            case 9:
                String str3 = (String) obj;
                str3.getClass();
                w44Var.setValue(str3);
                return pn6Var;
            case 10:
                ((String) obj).getClass();
                w44Var.setValue(lh6.x);
                return pn6Var;
            case 11:
                ((String) obj).getClass();
                w44Var.setValue(lh6.y);
                return pn6Var;
            case 12:
                w44Var.setValue((ha3) obj);
                return pn6Var;
            case 13:
                Context context = (Context) obj;
                context.getClass();
                return new yp4(context, w44Var);
            case 14:
                View view = (View) obj;
                view.getClass();
                w44Var.setValue(view);
                return pn6Var;
            case 15:
                String str4 = (String) obj;
                str4.getClass();
                w44Var.setValue(str4);
                return pn6Var;
            case 16:
                String str5 = (String) obj;
                str5.getClass();
                w44Var.setValue(str5);
                return pn6Var;
            case 17:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((ub2) w44Var.getValue()).invoke(f)).floatValue());
            case 18:
                return new i5(w44Var, (byte) 14);
            case 19:
                ((ub2) w44Var.getValue()).invoke((xc4) obj);
                return pn6Var;
            case 20:
                w44Var.setValue((ha3) obj);
                return pn6Var;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                w44Var.setValue(bool);
                return pn6Var;
            case 22:
                String str6 = (String) obj;
                str6.getClass();
                w44Var.setValue(str6);
                return pn6Var;
            case 23:
                kk1 kk1Var = (kk1) obj;
                kk1Var.getClass();
                w44Var.setValue(kk1Var);
                return pn6Var;
            default:
                n17 n17Var = (n17) obj;
                n17Var.getClass();
                w44Var.setValue(n17Var);
                return pn6Var;
        }
    }
}
