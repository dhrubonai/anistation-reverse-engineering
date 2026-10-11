package g3;

import f1.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j implements y2.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f4389a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f4390b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f4391c;

    public j(ArrayList arrayList) {
        this.f4389a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f4390b = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = (c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f4390b;
            jArr[i11] = cVar.f4362b;
            jArr[i11 + 1] = cVar.f4363c;
        }
        long[] jArr2 = this.f4390b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f4391c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // y2.d
    public final int a(long j4) {
        long[] jArr = this.f4391c;
        int b10 = b0.b(jArr, j4, false);
        if (b10 >= jArr.length) {
            return -1;
        }
        return b10;
    }

    @Override // y2.d
    public final long b(int i10) {
        boolean z9;
        boolean z10 = true;
        if (i10 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        long[] jArr = this.f4391c;
        if (i10 >= jArr.length) {
            z10 = false;
        }
        w7.b.g(z10);
        return jArr[i10];
    }

    @Override // y2.d
    public final List c(long j4) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            List list = this.f4389a;
            if (i10 >= list.size()) {
                break;
            }
            int i11 = i10 * 2;
            long[] jArr = this.f4390b;
            if (jArr[i11] <= j4 && j4 < jArr[i11 + 1]) {
                c cVar = (c) list.get(i10);
                e1.b bVar = cVar.f4361a;
                if (bVar.f3351e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i10++;
        }
        Collections.sort(arrayList2, new d0.b(20));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            e1.b bVar2 = ((c) arrayList2.get(i12)).f4361a;
            bVar2.getClass();
            arrayList.add(new e1.b(bVar2.f3347a, bVar2.f3348b, bVar2.f3349c, bVar2.f3350d, (-1) - i12, 1, bVar2.f3353g, bVar2.f3354h, bVar2.f3355i, bVar2.f3360n, bVar2.o, bVar2.f3356j, bVar2.f3357k, bVar2.f3358l, bVar2.f3359m, bVar2.f3361p, bVar2.f3362q));
        }
        return arrayList;
    }

    @Override // y2.d
    public final int d() {
        return this.f4391c.length;
    }
}
