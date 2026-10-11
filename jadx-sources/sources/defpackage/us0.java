package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class us0 implements lc2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ us0(byte b) {
        this.x = b;
    }

    @Override // defpackage.lc2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        boolean h;
        boolean h2;
        int i2;
        boolean h3;
        boolean h4;
        byte b = this.x;
        boolean z = false;
        int i3 = 128;
        int i4 = 16;
        int i5 = 2;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                b96 b96Var = (b96) obj;
                q86 q86Var = (q86) obj2;
                sb2 sb2Var = (sb2) obj3;
                kd2 kd2Var = (kd2) obj4;
                int intValue = ((Integer) obj5).intValue();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h2 = kd2Var.f(b96Var);
                    } else {
                        h2 = kd2Var.h(b96Var);
                    }
                    if (h2) {
                        i5 = 4;
                    }
                    i = intValue | i5;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    if ((intValue & 64) == 0) {
                        h = kd2Var.f(q86Var);
                    } else {
                        h = kd2Var.h(q86Var);
                    }
                    if (h) {
                        i4 = 32;
                    }
                    i |= i4;
                }
                if ((intValue & 384) == 0) {
                    if (kd2Var.h(sb2Var)) {
                        i3 = 256;
                    }
                    i |= i3;
                }
                if ((i & 1171) != 1170) {
                    z = true;
                }
                if (kd2Var.V(i & 1, z)) {
                    xa1.c(b96Var, q86Var, sb2Var, kd2Var, i & 1022);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                b96 b96Var2 = (b96) obj;
                q86 q86Var2 = (q86) obj2;
                sb2 sb2Var2 = (sb2) obj3;
                kd2 kd2Var2 = (kd2) obj4;
                int intValue2 = ((Integer) obj5).intValue();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h4 = kd2Var2.f(b96Var2);
                    } else {
                        h4 = kd2Var2.h(b96Var2);
                    }
                    if (h4) {
                        i5 = 4;
                    }
                    i2 = intValue2 | i5;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if ((intValue2 & 64) == 0) {
                        h3 = kd2Var2.f(q86Var2);
                    } else {
                        h3 = kd2Var2.h(q86Var2);
                    }
                    if (h3) {
                        i4 = 32;
                    }
                    i2 |= i4;
                }
                if ((intValue2 & 384) == 0) {
                    if (kd2Var2.h(sb2Var2)) {
                        i3 = 256;
                    }
                    i2 |= i3;
                }
                if ((i2 & 1171) != 1170) {
                    z = true;
                }
                if (kd2Var2.V(i2 & 1, z)) {
                    xa1.c(b96Var2, q86Var2, sb2Var2, kd2Var2, i2 & 1022);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            default:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                long j = ((nd6) obj5).a;
                String obj6 = ((CharSequence) obj4).subSequence(nd6.g(j), nd6.f(j)).toString();
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", booleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = putExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", obj6);
                ((Context) obj).startActivity(className);
                return pn6Var;
        }
    }
}
