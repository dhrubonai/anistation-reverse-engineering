package w2;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends i1.a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10793c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10794d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10795e;

    public a(int i10, long j4) {
        super(i10);
        this.f10793c = j4;
        this.f10794d = new ArrayList();
        this.f10795e = new ArrayList();
    }

    public final a h(int i10) {
        ArrayList arrayList = this.f10795e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f5247b == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b i(int i10) {
        ArrayList arrayList = this.f10794d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f5247b == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // i1.a
    public final String toString() {
        return i1.a.f(this.f5247b) + " leaves: " + Arrays.toString(this.f10794d.toArray()) + " containers: " + Arrays.toString(this.f10795e.toArray());
    }
}
