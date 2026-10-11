package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cf implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ w44 y;

    public /* synthetic */ cf(w44 w44Var, byte b) {
        this.x = b;
        this.y = w44Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w44 w44Var = this.y;
        switch (b) {
            case 0:
                ha3 ha3Var = (ha3) w44Var.getValue();
                if (ha3Var != null) {
                    return ha3Var;
                }
                hz2.d("Required value was null.");
                v71.e();
                return null;
            case 1:
                Boolean bool = (Boolean) w44Var.getValue();
                bool.getClass();
                return bool;
            case 2:
                Boolean bool2 = (Boolean) w44Var.getValue();
                bool2.getClass();
                return bool2;
            case 3:
                Boolean bool3 = (Boolean) w44Var.getValue();
                bool3.getClass();
                return bool3;
            case 4:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
            case 5:
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
            case 6:
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
            case 7:
                w44Var.setValue(Boolean.TRUE);
                return pn6Var;
            case 8:
                ha3 ha3Var2 = (ha3) w44Var.getValue();
                if (ha3Var2 != null) {
                    return ha3Var2;
                }
                hz2.d("Required value was null.");
                v71.e();
                return null;
            case 9:
                if (w44Var == null) {
                    return null;
                }
                return (List) w44Var.getValue();
            case 10:
                Boolean bool4 = (Boolean) w44Var.getValue();
                bool4.booleanValue();
                return bool4;
            case 11:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
            case 12:
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
            case 13:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
            case 14:
                w44Var.setValue(Boolean.TRUE);
                return pn6Var;
            case 15:
                w44Var.setValue(Boolean.TRUE);
                return pn6Var;
            case 16:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
            case 17:
                w44Var.setValue(Boolean.TRUE);
                return pn6Var;
            case 18:
                w44Var.setValue(Boolean.TRUE);
                return pn6Var;
            case 19:
                return new bc3((ub2) w44Var.getValue());
            case 20:
                return (rd3) ((sb2) w44Var.getValue()).invoke();
            case 21:
                return new pe3((ub2) w44Var.getValue());
            case 22:
                ha3 ha3Var3 = (ha3) w44Var.getValue();
                if (ha3Var3 != null) {
                    return ha3Var3;
                }
                hz2.d("Required value was null.");
                v71.e();
                return null;
            case 23:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
            case 24:
                w44Var.setValue(Boolean.FALSE);
                return pn6Var;
            case 25:
                w44Var.setValue(null);
                return pn6Var;
            case 26:
                w44Var.setValue(Boolean.TRUE);
                return pn6Var;
            case 27:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
            case 28:
                return (ha3) w44Var.getValue();
            default:
                w44Var.setValue(Boolean.valueOf(!((Boolean) w44Var.getValue()).booleanValue()));
                return pn6Var;
        }
    }
}
