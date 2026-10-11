package e3;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3407a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3408b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3409c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3410d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3411e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3412f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f3413g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3414h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3415i;

    /* renamed from: j, reason: collision with root package name */
    public final c f3416j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f3417k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f3418l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f3419m;

    public c(String str, String str2, long j4, long j10, g gVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z9;
        this.f3407a = str;
        this.f3408b = str2;
        this.f3415i = str4;
        this.f3412f = gVar;
        this.f3413g = strArr;
        if (str2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f3409c = z9;
        this.f3410d = j4;
        this.f3411e = j10;
        str3.getClass();
        this.f3414h = str3;
        this.f3416j = cVar;
        this.f3417k = new HashMap();
        this.f3418l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            e1.a aVar = new e1.a();
            aVar.f3322a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((e1.a) treeMap.get(str)).f3322a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i10) {
        ArrayList arrayList = this.f3419m;
        if (arrayList != null) {
            return (c) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f3419m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z9) {
        boolean z10;
        String str = this.f3407a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z9 || equals || (equals2 && this.f3415i != null)) {
            long j4 = this.f3410d;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
            long j10 = this.f3411e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f3419m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f3419m.size(); i10++) {
            c cVar = (c) this.f3419m.get(i10);
            if (!z9 && !equals) {
                z10 = false;
            } else {
                z10 = true;
            }
            cVar.d(treeSet, z10);
        }
    }

    public final boolean f(long j4) {
        long j10 = this.f3410d;
        long j11 = this.f3411e;
        if ((j10 == -9223372036854775807L && j11 == -9223372036854775807L) || ((j10 <= j4 && j11 == -9223372036854775807L) || ((j10 == -9223372036854775807L && j4 < j11) || (j10 <= j4 && j4 < j11)))) {
            return true;
        }
        return false;
    }

    public final void g(long j4, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f3414h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j4) && "div".equals(this.f3407a) && (str2 = this.f3415i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < c(); i10++) {
            b(i10).g(j4, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.c.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j4, boolean z9, String str, TreeMap treeMap) {
        String str2;
        boolean z10;
        HashMap hashMap = this.f3417k;
        hashMap.clear();
        HashMap hashMap2 = this.f3418l;
        hashMap2.clear();
        String str3 = this.f3407a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.f3414h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.f3409c && z9) {
            SpannableStringBuilder e10 = e(str2, treeMap);
            String str5 = this.f3408b;
            str5.getClass();
            e10.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str3) && z9) {
            e(str2, treeMap).append('\n');
            return;
        }
        if (f(j4)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((e1.a) entry.getValue()).f3322a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i10 = 0; i10 < c(); i10++) {
                c b10 = b(i10);
                if (!z9 && !equals) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                b10.i(j4, z10, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e11 = e(str2, treeMap);
                int length = e11.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (e11.charAt(length) == ' ');
                if (length >= 0 && e11.charAt(length) != '\n') {
                    e11.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((e1.a) entry2.getValue()).f3322a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
