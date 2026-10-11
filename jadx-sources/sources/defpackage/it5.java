package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class it5 {
    /* JADX WARN: Type inference failed for: r9v1, types: [ki4, sz5] */
    public static final ki4 b(kk2 kk2Var) {
        kk2 kk2Var2 = new kk2((byte) 1);
        for (String str : ((Map) kk2Var.x).keySet()) {
            List s = kk2Var.s(str);
            if (s == null) {
                s = nt1.x;
            }
            String e = lo0.e(str, 0, 0, 15);
            ArrayList arrayList = new ArrayList(zo0.V(s, 10));
            Iterator it = s.iterator();
            while (it.hasNext()) {
                arrayList.add(lo0.e((String) it.next(), 0, 0, 11));
            }
            kk2Var2.j(e, arrayList);
        }
        return new sz5((Map) kk2Var2.x, true);
    }

    public static final boolean c(KeyEvent keyEvent) {
        InputDevice device = keyEvent.getDevice();
        if (device == null || device.isVirtual() || device.getKeyboardType() != 2 || (keyEvent.getFlags() & 2) == 2) {
            return false;
        }
        return true;
    }

    public static final boolean d(KeyEvent keyEvent) {
        if ((keyEvent.getFlags() & 2) == 2) {
            return true;
        }
        return false;
    }

    public static String e(oa0 oa0Var, Charset charset) {
        oa0Var.getClass();
        charset.getClass();
        for (long j = 1; oa0Var.g(j); j *= 2) {
        }
        return mv5.h(oa0Var, oa0Var.z, charset);
    }

    public static String f(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static final void g(pe3 pe3Var, String str, List list, String str2, float f, vm1 vm1Var, ub2 ub2Var) {
        list.getClass();
        ub2Var.getClass();
        byte b = 2;
        byte b2 = 1;
        if (list.isEmpty()) {
            pe3.A0(pe3Var, str.concat("-empty"), new os0(-1954361205, true, new dw1(vm1Var, (byte) 4)), 2);
            return;
        }
        pe3.A0(pe3Var, str.concat("-spacer"), new os0(-106028944, true, new xz4(f, b)), 2);
        pe3Var.B0(list.size(), new od(new q10(str, (byte) 6), list, (byte) 27), new eo(list, (byte) 16), new os0(2039820996, true, new ob5(list, str2, ub2Var, b2)));
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qi2.m(str.concat(" must not be null"));
    }

    public static void i(int i, int i2) {
        String m;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                ze0.k(h11.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                return;
            }
            m = iv5.m("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            m = iv5.m("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(m);
    }

    public static void j(int i, int i2, int i3) {
        String k;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                k = iv5.m("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                k = k("end index", i2, i3);
            }
        } else {
            k = k("start index", i, i3);
        }
        throw new IndexOutOfBoundsException(k);
    }

    public static String k(String str, int i, int i2) {
        if (i < 0) {
            return iv5.m("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return iv5.m("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ze0.k(h11.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }

    public void a() {
    }
}
