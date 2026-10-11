package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class io implements Appendable {
    public final StringBuilder x;
    public final ArrayList y;
    public final ArrayList z;

    public io() {
        this.x = new StringBuilder(16);
        this.y = new ArrayList();
        this.z = new ArrayList();
        new ArrayList();
    }

    public final void a(ko koVar) {
        StringBuilder sb = this.x;
        int length = sb.length();
        sb.append(koVar.y);
        List list = koVar.x;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jo joVar = (jo) list.get(i);
                this.z.add(new ho(joVar.a, joVar.b + length, joVar.c + length, joVar.d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof ko;
        StringBuilder sb = this.x;
        if (z) {
            ko koVar = (ko) charSequence;
            int length = sb.length();
            sb.append((CharSequence) koVar.y, i, i2);
            List a = lo.a(koVar, i, i2, null);
            if (a != null) {
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    jo joVar = (jo) a.get(i3);
                    this.z.add(new ho(joVar.a, joVar.b + length, joVar.c + length, joVar.d));
                }
            }
            return this;
        }
        sb.append(charSequence, i, i2);
        return this;
    }

    public final void b(String str) {
        this.x.append(str);
    }

    public final void c(int i) {
        ArrayList arrayList = this.y;
        if (i >= arrayList.size()) {
            fz2.b(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            if (arrayList.isEmpty()) {
                fz2.b("Nothing to pop.");
            }
            ((ho) arrayList.remove(arrayList.size() - 1)).c = this.x.length();
        }
    }

    public final int d(pv5 pv5Var) {
        ho hoVar = new ho(pv5Var, this.x.length(), 0, 12);
        this.y.add(hoVar);
        this.z.add(hoVar);
        return r5.size() - 1;
    }

    public final ko e() {
        StringBuilder sb = this.x;
        String sb2 = sb.toString();
        ArrayList arrayList = this.z;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((ho) arrayList.get(i)).a(sb.length()));
        }
        return new ko(sb2, arrayList2);
    }

    public io(ko koVar) {
        this();
        a(koVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof ko) {
            a((ko) charSequence);
            return this;
        }
        this.x.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.x.append(c);
        return this;
    }
}
