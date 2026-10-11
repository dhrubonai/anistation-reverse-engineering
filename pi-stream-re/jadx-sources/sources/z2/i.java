package z2;

import f1.b0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public abstract class i implements y2.e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f12031a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f12032b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f12033c;

    /* renamed from: d, reason: collision with root package name */
    public g f12034d;

    /* renamed from: e, reason: collision with root package name */
    public long f12035e;

    /* renamed from: f, reason: collision with root package name */
    public long f12036f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f12031a.add(new g());
        }
        this.f12032b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f12032b.add(new h(new w.f(this, 19)));
        }
        this.f12033c = new PriorityQueue();
    }

    @Override // i1.e
    public void a() {
    }

    @Override // i1.e
    public final void b(y2.i iVar) {
        boolean z9;
        if (iVar == this.f12034d) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        g gVar = (g) iVar;
        if (gVar.g(Integer.MIN_VALUE)) {
            gVar.h();
            this.f12031a.add(gVar);
        } else {
            long j4 = this.f12036f;
            this.f12036f = 1 + j4;
            gVar.C = j4;
            this.f12033c.add(gVar);
        }
        this.f12034d = null;
    }

    @Override // y2.e
    public final void c(long j4) {
        this.f12035e = j4;
    }

    @Override // i1.e
    public final Object e() {
        boolean z9;
        if (this.f12034d == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        ArrayDeque arrayDeque = this.f12031a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f12034d = gVar;
        return gVar;
    }

    public abstract j f();

    @Override // i1.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f12036f = 0L;
        this.f12035e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f12033c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f12031a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = b0.f3799a;
            gVar.h();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f12034d;
        if (gVar2 != null) {
            gVar2.h();
            arrayDeque.add(gVar2);
            this.f12034d = null;
        }
    }

    public abstract void g(g gVar);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return null;
     */
    @Override // i1.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y2.j d() {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = r12.f12032b
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.util.PriorityQueue r1 = r12.f12033c
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = r1.peek()
            z2.g r3 = (z2.g) r3
            int r4 = f1.b0.f3799a
            long r3 = r3.f5264x
            long r5 = r12.f12035e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L6d
            java.lang.Object r1 = r1.poll()
            z2.g r1 = (z2.g) r1
            r3 = 4
            boolean r4 = r1.g(r3)
            java.util.ArrayDeque r5 = r12.f12031a
            if (r4 == 0) goto L41
            java.lang.Object r0 = r0.pollFirst()
            y2.j r0 = (y2.j) r0
            r0.e(r3)
            r1.h()
            r5.add(r1)
            return r0
        L41:
            r12.g(r1)
            boolean r3 = r12.i()
            if (r3 == 0) goto L66
            z2.j r9 = r12.f()
            java.lang.Object r0 = r0.pollFirst()
            y2.j r0 = (y2.j) r0
            long r7 = r1.f5264x
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r0
            r6.j(r7, r9, r10)
            r1.h()
            r5.add(r1)
            return r0
        L66:
            r1.h()
            r5.add(r1)
            goto La
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.i.d():y2.j");
    }

    public abstract boolean i();
}
