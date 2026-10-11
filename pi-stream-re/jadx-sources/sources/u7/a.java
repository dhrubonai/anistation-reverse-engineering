package u7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: z, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10295z = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* renamed from: a, reason: collision with root package name */
    public final l f10296a;

    /* renamed from: b, reason: collision with root package name */
    public final i7.k f10297b;

    /* renamed from: c, reason: collision with root package name */
    public int f10298c;

    /* renamed from: d, reason: collision with root package name */
    public long f10299d;

    /* renamed from: e, reason: collision with root package name */
    public long f10300e;

    /* renamed from: f, reason: collision with root package name */
    public int f10301f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10302x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f10303y;

    public a(b bVar, int i10) {
        this.f10303y = bVar;
        setDaemon(true);
        this.f10296a = new l();
        this.f10297b = new i7.k();
        this.f10298c = 4;
        this.nextParkedWorker = b.B;
        j7.d.f6268a.getClass();
        this.f10301f = j7.d.f6269b.a().nextInt();
        f(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u7.h a(boolean r11) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.a.a(boolean):u7.h");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i10) {
        int i11 = this.f10301f;
        int i12 = i11 ^ (i11 << 13);
        int i13 = i12 ^ (i12 >> 17);
        int i14 = i13 ^ (i13 << 5);
        this.f10301f = i14;
        int i15 = i10 - 1;
        if ((i15 & i10) == 0) {
            return i14 & i15;
        }
        return (i14 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i10;
    }

    public final h e() {
        int d10 = d(2);
        b bVar = this.f10303y;
        if (d10 == 0) {
            h hVar = (h) bVar.f10310e.d();
            if (hVar != null) {
                return hVar;
            }
            return (h) bVar.f10311f.d();
        }
        h hVar2 = (h) bVar.f10311f.d();
        if (hVar2 != null) {
            return hVar2;
        }
        return (h) bVar.f10310e.d();
    }

    public final void f(int i10) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10303y.f10309d);
        sb.append("-worker-");
        if (i10 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i10);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i10;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i10) {
        int i11 = this.f10298c;
        boolean z9 = true;
        if (i11 != 1) {
            z9 = false;
        }
        if (z9) {
            b.f10305z.addAndGet(this.f10303y, 4398046511104L);
        }
        if (i11 != i10) {
            this.f10298c = i10;
        }
        return z9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0092, code lost:
    
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008e, code lost:
    
        r7 = -2;
        r18 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u7.h i(int r21) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.a.i(int):u7.h");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.a.run():void");
    }
}
