package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class w88 {
    protected transient int zza;

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ArrayList arrayList, ja8 ja8Var) {
        Charset charset = la8.a;
        int size = arrayList.size();
        if (ja8Var instanceof ArrayList) {
            ((ArrayList) ja8Var).ensureCapacity(ja8Var.size() + size);
        } else if (ja8Var instanceof nb8) {
            nb8 nb8Var = (nb8) ja8Var;
            int i = nb8Var.z + size;
            int length = nb8Var.y.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = zo5.f(length, 3, 2, 1, 10);
                    }
                    nb8Var.y = Arrays.copyOf(nb8Var.y, length);
                } else {
                    nb8Var.y = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = ja8Var.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                int size4 = ja8Var.size() - size2;
                StringBuilder sb = new StringBuilder(String.valueOf(size4).length() + 26);
                sb.append("Element at index ");
                sb.append(size4);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size5 = ja8Var.size();
                while (true) {
                    size5--;
                    if (size5 >= size2) {
                        ja8Var.remove(size5);
                    } else {
                        qi2.m(sb2);
                        return;
                    }
                }
            } else {
                ja8Var.add(obj);
            }
        }
    }

    public abstract int a();

    public abstract int b(pb8 pb8Var);
}
