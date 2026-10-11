package n1;

import android.net.Uri;
import c1.a1;
import c1.d0;
import f1.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements u1.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f7908a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7909b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7910c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7911d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7912e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7913f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7914g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7915h;

    /* renamed from: i, reason: collision with root package name */
    public final u f7916i;

    /* renamed from: j, reason: collision with root package name */
    public final d0 f7917j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f7918k;

    /* renamed from: l, reason: collision with root package name */
    public final i f7919l;

    /* renamed from: m, reason: collision with root package name */
    public final List f7920m;

    public c(long j4, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, i iVar, u uVar, d0 d0Var, Uri uri, ArrayList arrayList) {
        this.f7908a = j4;
        this.f7909b = j10;
        this.f7910c = j11;
        this.f7911d = z9;
        this.f7912e = j12;
        this.f7913f = j13;
        this.f7914g = j14;
        this.f7915h = j15;
        this.f7919l = iVar;
        this.f7916i = uVar;
        this.f7918k = uri;
        this.f7917j = d0Var;
        this.f7920m = arrayList;
    }

    @Override // u1.a
    public final Object a(List list) {
        long j4;
        ArrayList arrayList;
        long j10;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new a1());
        ArrayList arrayList3 = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (i10 < c()) {
            if (((a1) linkedList.peek()).f1623a != i10) {
                long d10 = d(i10);
                if (d10 != -9223372036854775807L) {
                    j11 += d10;
                }
                arrayList2 = arrayList3;
            } else {
                h b10 = b(i10);
                List list2 = b10.f7944c;
                a1 a1Var = (a1) linkedList.poll();
                int i11 = a1Var.f1623a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i12 = a1Var.f1624b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.f7900c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((m) list3.get(a1Var.f1625c));
                        a1Var = (a1) linkedList.poll();
                        if (a1Var.f1623a != i11) {
                            break;
                        }
                    } while (a1Var.f1624b == i12);
                    arrayList = arrayList3;
                    j10 = j11;
                    arrayList4.add(new a(aVar.f7898a, aVar.f7899b, arrayList5, aVar.f7901d, aVar.f7902e, aVar.f7903f));
                    if (a1Var.f1623a != i11) {
                        break;
                    }
                    arrayList3 = arrayList;
                    j11 = j10;
                }
                linkedList.addFirst(a1Var);
                arrayList2 = arrayList;
                arrayList2.add(new h(b10.f7942a, b10.f7943b - j10, arrayList4, b10.f7945d));
                j11 = j10;
            }
            i10++;
            arrayList3 = arrayList2;
        }
        ArrayList arrayList6 = arrayList3;
        long j12 = j11;
        long j13 = this.f7909b;
        if (j13 != -9223372036854775807L) {
            j4 = j13 - j12;
        } else {
            j4 = -9223372036854775807L;
        }
        return new c(this.f7908a, j4, this.f7910c, this.f7911d, this.f7912e, this.f7913f, this.f7914g, this.f7915h, this.f7919l, this.f7916i, this.f7917j, this.f7918k, arrayList6);
    }

    public final h b(int i10) {
        return (h) this.f7920m.get(i10);
    }

    public final int c() {
        return this.f7920m.size();
    }

    public final long d(int i10) {
        long j4;
        long j10;
        List list = this.f7920m;
        if (i10 == list.size() - 1) {
            j4 = this.f7909b;
            if (j4 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i10)).f7943b;
        } else {
            j4 = ((h) list.get(i10 + 1)).f7943b;
            j10 = ((h) list.get(i10)).f7943b;
        }
        return j4 - j10;
    }

    public final long e(int i10) {
        return b0.O(d(i10));
    }
}
