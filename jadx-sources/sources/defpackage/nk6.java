package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nk6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final rk6 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final nk6 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public nk6(String str, String str2, long j, long j2, rk6 rk6Var, String[] strArr, String str3, String str4, nk6 nk6Var) {
        boolean z;
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = rk6Var;
        this.g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = nk6Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static nk6 a(String str) {
        return new nk6(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a31 a31Var = new a31();
            a31Var.a = new SpannableStringBuilder();
            a31Var.b = null;
            treeMap.put(str, a31Var);
        }
        CharSequence charSequence = ((a31) treeMap.get(str)).a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final nk6 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (nk6) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        boolean z2;
        String str = this.a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                nk6 nk6Var = (nk6) this.m.get(i);
                if (!z && !equals) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                nk6Var.d(treeSet, z2);
            }
        }
    }

    public final boolean f(long j) {
        long j2 = this.d;
        long j3 = this.e;
        if (j2 != -9223372036854775807L || j3 != -9223372036854775807L) {
            if (j2 > j || j3 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L || j >= j3) {
                    if (j2 <= j && j < j3) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk6.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        String str2;
        boolean z2;
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str3 = this.a;
        if (!"metadata".equals(str3)) {
            String str4 = this.h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.c && z) {
                SpannableStringBuilder e = e(str2, treeMap);
                String str5 = this.b;
                str5.getClass();
                e.append((CharSequence) str5);
                return;
            }
            if ("br".equals(str3) && z) {
                e(str2, treeMap).append('\n');
                return;
            }
            if (f(j)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    String str6 = (String) entry.getKey();
                    CharSequence charSequence = ((a31) entry.getValue()).a;
                    charSequence.getClass();
                    hashMap.put(str6, Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i = 0; i < c(); i++) {
                    nk6 b = b(i);
                    if (!z && !equals) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    b.i(j, z2, str2, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e2 = e(str2, treeMap);
                    int length = e2.length() - 1;
                    while (length >= 0 && e2.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e2.charAt(length) != '\n') {
                        e2.append('\n');
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    String str7 = (String) entry2.getKey();
                    CharSequence charSequence2 = ((a31) entry2.getValue()).a;
                    charSequence2.getClass();
                    hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
