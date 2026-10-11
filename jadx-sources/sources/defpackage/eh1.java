package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eh1 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public tu g;
    public int h;
    public final /* synthetic */ hh1 i;

    public eh1(hh1 hh1Var, String str) {
        this.i = hh1Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.x.e(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.x.e(sb.toString()));
            sb.setLength(length);
        }
    }

    public final fh1 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            hh1 hh1Var = this.i;
            if (i < size) {
                if (!hh1Var.N.A((qj4) arrayList.get(i))) {
                    try {
                        hh1Var.d0(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            } else {
                this.h++;
                return new fh1(hh1Var, this);
            }
        }
    }
}
