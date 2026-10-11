package y8;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public String f11771a;

    /* renamed from: d, reason: collision with root package name */
    public String f11774d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f11776f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f11777g;

    /* renamed from: h, reason: collision with root package name */
    public String f11778h;

    /* renamed from: b, reason: collision with root package name */
    public String f11772b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f11773c = "";

    /* renamed from: e, reason: collision with root package name */
    public int f11775e = -1;

    public p() {
        ArrayList arrayList = new ArrayList();
        this.f11776f = arrayList;
        arrayList.add("");
    }

    public final q a() {
        ArrayList arrayList;
        String str;
        String str2 = this.f11771a;
        if (str2 != null) {
            char[] cArr = q.f11779k;
            String t9 = j.t(this.f11772b, 0, 0, false, 7);
            String t10 = j.t(this.f11773c, 0, 0, false, 7);
            String str3 = this.f11774d;
            if (str3 != null) {
                int i10 = this.f11775e;
                if (i10 == -1) {
                    String str4 = this.f11771a;
                    r6.h0.q(str4);
                    i10 = j.h(str4);
                }
                int i11 = i10;
                ArrayList arrayList2 = this.f11776f;
                ArrayList arrayList3 = new ArrayList(x6.j.o0(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str5 = (String) it.next();
                    char[] cArr2 = q.f11779k;
                    arrayList3.add(j.t(str5, 0, 0, false, 7));
                }
                ArrayList<String> arrayList4 = this.f11777g;
                String str6 = null;
                if (arrayList4 != null) {
                    arrayList = new ArrayList(x6.j.o0(arrayList4));
                    for (String str7 : arrayList4) {
                        if (str7 != null) {
                            char[] cArr3 = q.f11779k;
                            str = j.t(str7, 0, 0, true, 3);
                        } else {
                            str = null;
                        }
                        arrayList.add(str);
                    }
                } else {
                    arrayList = null;
                }
                String str8 = this.f11778h;
                if (str8 != null) {
                    char[] cArr4 = q.f11779k;
                    str6 = j.t(str8, 0, 0, false, 7);
                }
                return new q(str2, t9, t10, str3, i11, arrayList3, arrayList, str6, toString());
            }
            throw new IllegalStateException("host == null");
        }
        throw new IllegalStateException("scheme == null");
    }

    public final void b(String str) {
        ArrayList arrayList;
        if (str != null) {
            char[] cArr = q.f11779k;
            arrayList = j.u(j.c(str, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            arrayList = null;
        }
        this.f11777g = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x0268, code lost:
    
        if (r2 != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r13 == ':') goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02dc  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(y8.q r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.p.c(y8.q, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r1 != y8.j.h(r3)) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.p.toString():java.lang.String");
    }
}
