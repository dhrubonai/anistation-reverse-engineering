package defpackage;

import android.app.UiModeManager;
import android.view.View;
import android.view.ViewParent;
import com.anistation.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nz5 {
    public static UiModeManager a;

    public static final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final p86 b(yc1 yc1Var) {
        a96 a96Var;
        n86 n86Var = new n86();
        iv5.i(yc1Var, r86.a, new pp5(new pp5((Object) n86Var, (byte) 8), new nl5(1, n86Var, n86.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 12)));
        f44 f44Var = new f44();
        f44 f44Var2 = n86Var.a;
        Object[] objArr = f44Var2.a;
        int i = f44Var2.b;
        byte b = 0;
        Object obj = null;
        int i2 = 0;
        boolean z = true;
        o86 o86Var = null;
        while (true) {
            a96Var = a96.b;
            if (i2 >= i) {
                break;
            }
            o86 o86Var2 = (o86) objArr[i2];
            if (!z || o86Var2 != a96Var) {
                if (o86Var2 != a96Var || o86Var != a96Var) {
                    if (o86Var2 != a96Var) {
                        f44 f44Var3 = n86Var.b;
                        Object[] objArr2 = f44Var3.a;
                        int i3 = f44Var3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (((Boolean) ((ub2) objArr2[i4]).invoke(o86Var2)).booleanValue()) {
                            }
                        }
                    }
                    f44Var.a(o86Var2);
                    z = false;
                    o86Var = o86Var2;
                }
                z = false;
                break;
            }
            i2++;
        }
        if (!f44Var.i()) {
            obj = f44Var.a[f44Var.b - 1];
        }
        if (((o86) obj) == a96Var) {
            f44Var.l(f44Var.b - 1);
        }
        d44 d44Var = f44Var.c;
        if (d44Var == null) {
            d44Var = new d44(f44Var, b);
            f44Var.c = d44Var;
        }
        return new p86(d44Var);
    }

    public static final long c() {
        return Thread.currentThread().getId();
    }

    public static final ViewParent d(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static ik7 e(Object obj) {
        if (obj == null) {
            return ik7.q;
        }
        if (obj instanceof String) {
            return new tk7((String) obj);
        }
        if (obj instanceof Double) {
            return new xh7((Double) obj);
        }
        if (obj instanceof Long) {
            return new xh7(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new xh7(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new lg7((Boolean) obj);
        }
        if (obj instanceof Map) {
            zj7 zj7Var = new zj7();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                ik7 e = e(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    zj7Var.g((String) obj2, e);
                }
            }
            return zj7Var;
        }
        if (obj instanceof List) {
            rf7 rf7Var = new rf7();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                rf7Var.r(rf7Var.p(), e(it.next()));
            }
            return rf7Var;
        }
        ze0.k("Invalid value type");
        return null;
    }

    public static ik7 f(ov7 ov7Var) {
        if (ov7Var == null) {
            return ik7.p;
        }
        int z = ov7Var.z() - 1;
        if (z != 1) {
            if (z != 2) {
                if (z != 3) {
                    if (z == 4) {
                        List r = ov7Var.r();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = r.iterator();
                        while (it.hasNext()) {
                            arrayList.add(f((ov7) it.next()));
                        }
                        return new mk7(ov7Var.s(), arrayList);
                    }
                    ze0.k("Unknown type found. Cannot convert entity");
                    return null;
                }
                if (ov7Var.v()) {
                    return new lg7(Boolean.valueOf(ov7Var.w()));
                }
                return new lg7(null);
            }
            if (ov7Var.x()) {
                return new xh7(Double.valueOf(ov7Var.y()));
            }
            return new xh7(null);
        }
        if (ov7Var.t()) {
            return new tk7(ov7Var.u());
        }
        return ik7.w;
    }
}
