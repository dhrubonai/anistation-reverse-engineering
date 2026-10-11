package z1;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: h, reason: collision with root package name */
    public static final d0.b f11954h = new d0.b(15);

    /* renamed from: i, reason: collision with root package name */
    public static final d0.b f11955i = new d0.b(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f11956a;

    /* renamed from: e, reason: collision with root package name */
    public int f11960e;

    /* renamed from: f, reason: collision with root package name */
    public int f11961f;

    /* renamed from: g, reason: collision with root package name */
    public int f11962g;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f11958c = new s[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11957b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f11959d = -1;

    public t(int i10) {
        this.f11956a = i10;
    }

    public final void a(int i10, float f10) {
        s sVar;
        int i11 = this.f11959d;
        ArrayList arrayList = this.f11957b;
        if (i11 != 1) {
            Collections.sort(arrayList, f11954h);
            this.f11959d = 1;
        }
        int i12 = this.f11962g;
        s[] sVarArr = this.f11958c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f11962g = i13;
            sVar = sVarArr[i13];
        } else {
            sVar = new s();
        }
        int i14 = this.f11960e;
        this.f11960e = i14 + 1;
        sVar.f11951a = i14;
        sVar.f11952b = i10;
        sVar.f11953c = f10;
        arrayList.add(sVar);
        this.f11961f += i10;
        while (true) {
            int i15 = this.f11961f;
            int i16 = this.f11956a;
            if (i15 > i16) {
                int i17 = i15 - i16;
                s sVar2 = (s) arrayList.get(0);
                int i18 = sVar2.f11952b;
                if (i18 <= i17) {
                    this.f11961f -= i18;
                    arrayList.remove(0);
                    int i19 = this.f11962g;
                    if (i19 < 5) {
                        this.f11962g = i19 + 1;
                        sVarArr[i19] = sVar2;
                    }
                } else {
                    sVar2.f11952b = i18 - i17;
                    this.f11961f -= i17;
                }
            } else {
                return;
            }
        }
    }

    public final float b() {
        int i10 = this.f11959d;
        ArrayList arrayList = this.f11957b;
        if (i10 != 0) {
            Collections.sort(arrayList, f11955i);
            this.f11959d = 0;
        }
        float f10 = 0.5f * this.f11961f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            s sVar = (s) arrayList.get(i12);
            i11 += sVar.f11952b;
            if (i11 >= f10) {
                return sVar.f11953c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) arrayList.get(arrayList.size() - 1)).f11953c;
    }
}
