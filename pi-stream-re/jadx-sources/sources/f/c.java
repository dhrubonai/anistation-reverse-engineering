package f;

import android.animation.Animator;
import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import androidx.fragment.app.m1;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import l1.b1;

/* loaded from: classes.dex */
public final class c implements k0.k, j0.f, c0.c, h3.c0, h4.a, f0.c, ActivityComponentBuilder {

    /* renamed from: e, reason: collision with root package name */
    public static c f3633e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3634a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3635b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3636c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3637d;

    public /* synthetic */ c(int i10) {
        this.f3634a = i10;
    }

    @Override // j0.f
    public final ClipDescription a() {
        return (ClipDescription) this.f3636c;
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponentBuilder activity(Activity activity) {
        activity.getClass();
        this.f3637d = activity;
        return this;
    }

    @Override // f0.c
    public final boolean b(Object obj) {
        if (obj instanceof q4.b) {
            ((q4.b) obj).c().f9199a = true;
        }
        switch (((f9.x) ((q4.c) this.f3636c)).f4108a) {
            case 23:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((f0.c) this.f3637d).b(obj);
    }

    @Override // dagger.hilt.android.internal.builders.ActivityComponentBuilder
    public final ActivityComponent build() {
        r6.h0.m((Activity) this.f3637d, Activity.class);
        return new x7.a((x7.g) this.f3635b, (x7.c) this.f3636c);
    }

    @Override // j0.f
    public final Object c() {
        return null;
    }

    @Override // h3.c0
    public final void d(f1.t tVar) {
        long d10;
        long j4;
        w7.b.w((f1.y) this.f3636c);
        int i10 = f1.b0.f3799a;
        f1.y yVar = (f1.y) this.f3636c;
        synchronized (yVar) {
            long j10 = yVar.f3869c;
            if (j10 != -9223372036854775807L) {
                d10 = j10 + yVar.f3868b;
            } else {
                d10 = yVar.d();
            }
            j4 = d10;
        }
        long e10 = ((f1.y) this.f3636c).e();
        if (j4 != -9223372036854775807L && e10 != -9223372036854775807L) {
            c1.v vVar = (c1.v) this.f3635b;
            if (e10 != vVar.f1938q) {
                vVar.getClass();
                c1.u uVar = new c1.u(vVar);
                uVar.f1911p = e10;
                c1.v vVar2 = new c1.v(uVar);
                this.f3635b = vVar2;
                ((d2.g0) this.f3637d).b(vVar2);
            }
            int i11 = tVar.f3860c - tVar.f3859b;
            ((d2.g0) this.f3637d).f(i11, tVar);
            ((d2.g0) this.f3637d).d(j4, 1, i11, 0, null);
        }
    }

    @Override // h3.c0
    public final void e(f1.y yVar, d2.r rVar, h3.i0 i0Var) {
        this.f3636c = yVar;
        i0Var.a();
        i0Var.b();
        d2.g0 i10 = rVar.i(i0Var.f4809d, 5);
        this.f3637d = i10;
        i10.b((c1.v) this.f3635b);
    }

    @Override // h4.a
    public final x3.e0 f(x3.e0 e0Var, v3.l lVar) {
        Drawable drawable = (Drawable) e0Var.get();
        if (drawable instanceof BitmapDrawable) {
            return ((h4.a) this.f3636c).f(e4.d.c(((BitmapDrawable) drawable).getBitmap(), (y3.d) this.f3635b), lVar);
        }
        if (drawable instanceof g4.c) {
            return ((h4.a) this.f3637d).f(e0Var, lVar);
        }
        return null;
    }

    @Override // j0.f
    public final Uri g() {
        return (Uri) this.f3635b;
    }

    @Override // j0.f
    public final void h() {
    }

    @Override // j0.f
    public final Uri i() {
        return (Uri) this.f3637d;
    }

    @Override // f0.c
    public final Object j() {
        Object j4 = ((f0.c) this.f3637d).j();
        if (j4 == null) {
            j4 = ((q4.a) this.f3635b).g();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + j4.getClass());
            }
        }
        if (j4 instanceof q4.b) {
            ((q4.b) j4).c().f9199a = false;
        }
        return j4;
    }

    public final String k(String str, long j4, int i10, long j10) {
        StringBuilder sb = new StringBuilder();
        for (int i11 = 0; i11 < ((List) this.f3636c).size(); i11++) {
            sb.append((String) ((List) this.f3635b).get(i11));
            if (((Integer) ((List) this.f3636c).get(i11)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) ((List) this.f3636c).get(i11)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) ((List) this.f3637d).get(i11), Long.valueOf(j4)));
            } else if (((Integer) ((List) this.f3636c).get(i11)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) ((List) this.f3637d).get(i11), Integer.valueOf(i10)));
            } else if (((Integer) ((List) this.f3636c).get(i11)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) ((List) this.f3637d).get(i11), Long.valueOf(j10)));
            }
        }
        sb.append((String) ((List) this.f3635b).get(((List) this.f3636c).size()));
        return sb.toString();
    }

    public final Bitmap l(BitmapFactory.Options options) {
        switch (this.f3634a) {
            case 13:
                return BitmapFactory.decodeStream(new p4.a(p4.b.c((ByteBuffer) this.f3635b)), null, options);
            case 14:
                e4.v vVar = (e4.v) ((com.bumptech.glide.load.data.n) this.f3635b).f2271b;
                vVar.reset();
                return BitmapFactory.decodeStream(vVar, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.n) this.f3637d).b().getFileDescriptor(), null, options);
        }
    }

    public final long m() {
        Object obj = this.f3637d;
        if (((d2.q) obj) != null) {
            return ((d2.q) obj).q();
        }
        return -1L;
    }

    public final d2.p n(Object... objArr) {
        Constructor constructor;
        synchronized (((AtomicBoolean) this.f3636c)) {
            if (((AtomicBoolean) this.f3636c).get()) {
                constructor = (Constructor) this.f3637d;
            } else {
                try {
                    try {
                        constructor = ((j1.l) ((d2.m) this.f3635b)).g();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f3636c).set(true);
                        constructor = (Constructor) this.f3637d;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (d2.p) constructor.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public final ImageHeaderParser$ImageType o() {
        e4.v vVar;
        switch (this.f3634a) {
            case 13:
                return p7.a0.F((List) this.f3636c, p4.b.c((ByteBuffer) this.f3635b));
            case 14:
                List list = (List) this.f3637d;
                e4.v vVar2 = (e4.v) ((com.bumptech.glide.load.data.n) this.f3635b).f2271b;
                vVar2.reset();
                return p7.a0.G((y3.h) this.f3636c, vVar2, list);
            default:
                List list2 = (List) this.f3636c;
                com.bumptech.glide.load.data.n nVar = (com.bumptech.glide.load.data.n) this.f3637d;
                y3.h hVar = (y3.h) this.f3635b;
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    v3.e eVar = (v3.e) list2.get(i10);
                    try {
                        vVar = new e4.v(new FileInputStream(nVar.b().getFileDescriptor()), hVar);
                        try {
                            ImageHeaderParser$ImageType d10 = eVar.d(vVar);
                            vVar.f();
                            nVar.b();
                            if (d10 != ImageHeaderParser$ImageType.UNKNOWN) {
                                return d10;
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (vVar != null) {
                                vVar.f();
                            }
                            nVar.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = null;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // c0.c
    public final void p() {
        ((Animator) this.f3635b).end();
        if (androidx.fragment.app.s0.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((m1) this.f3636c) + " has been canceled.");
        }
    }

    public final Location q(String str) {
        try {
            if (((LocationManager) this.f3636c).isProviderEnabled(str)) {
                return ((LocationManager) this.f3636c).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public final boolean r() {
        String trim;
        if (((String) this.f3637d) != null) {
            return true;
        }
        if (!((Queue) this.f3636c).isEmpty()) {
            String str = (String) ((Queue) this.f3636c).poll();
            str.getClass();
            this.f3637d = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f3635b).readLine();
            this.f3637d = readLine;
            if (readLine != null) {
                trim = readLine.trim();
                this.f3637d = trim;
            } else {
                return false;
            }
        } while (trim.isEmpty());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r6.f3180d != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0062, code lost:
    
        if (r6.f3180d != r11) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(h1.h r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, d2.r r15) {
        /*
            r7 = this;
            d2.l r6 = new d2.l
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f3637d = r6
            java.lang.Object r8 = r7.f3636c
            d2.p r8 = (d2.p) r8
            if (r8 == 0) goto L12
            return
        L12:
            java.lang.Object r8 = r7.f3635b
            d2.s r8 = (d2.s) r8
            d2.p[] r8 = r8.d(r9, r10)
            int r10 = r8.length
            r13 = 1
            r14 = 0
            if (r10 != r13) goto L25
            r8 = r8[r14]
            r7.f3636c = r8
            goto Lba
        L25:
            int r10 = r8.length
            r0 = r14
        L27:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.h(r6)     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            if (r2 == 0) goto L36
            r7.f3636c = r1     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            r6.f3182f = r14
            goto L70
        L36:
            java.lang.Object r1 = r7.f3636c
            d2.p r1 = (d2.p) r1
            if (r1 != 0) goto L67
            long r1 = r6.f3180d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L65
            goto L67
        L43:
            r8 = move-exception
            java.lang.Object r9 = r7.f3636c
            d2.p r9 = (d2.p) r9
            if (r9 != 0) goto L52
            long r9 = r6.f3180d
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L51
            goto L52
        L51:
            r13 = r14
        L52:
            w7.b.u(r13)
            r6.f3182f = r14
            throw r8
        L58:
            java.lang.Object r1 = r7.f3636c
            d2.p r1 = (d2.p) r1
            if (r1 != 0) goto L67
            long r1 = r6.f3180d
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L65
            goto L67
        L65:
            r1 = r14
            goto L68
        L67:
            r1 = r13
        L68:
            w7.b.u(r1)
            r6.f3182f = r14
            int r0 = r0 + 1
            goto L27
        L70:
            java.lang.Object r10 = r7.f3636c
            d2.p r10 = (d2.p) r10
            if (r10 != 0) goto Lba
            i2.d r10 = new i2.d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "None of the available extractors ("
            r11.<init>(r12)
            int r12 = f1.b0.f3799a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
        L86:
            int r13 = r8.length
            if (r14 >= r13) goto La3
            r13 = r8[r14]
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            int r13 = r8.length
            int r13 = r13 + (-1)
            if (r14 >= r13) goto La0
            java.lang.String r13 = ", "
            r12.append(r13)
        La0:
            int r14 = r14 + 1
            goto L86
        La3:
            java.lang.String r8 = r12.toString()
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r9.getClass()
            r10.<init>(r8)
            throw r10
        Lba:
            java.lang.Object r8 = r7.f3636c
            d2.p r8 = (d2.p) r8
            r8.f(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.s(h1.h, android.net.Uri, java.util.Map, long, long, d2.r):void");
    }

    public final boolean t(s.e eVar, q.e eVar2, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        r.b bVar = (r.b) this.f3636c;
        int[] iArr = eVar2.f8824c0;
        bVar.f9249a = iArr[0];
        boolean z14 = true;
        bVar.f9250b = iArr[1];
        bVar.f9251c = eVar2.m();
        ((r.b) this.f3636c).f9252d = eVar2.j();
        r.b bVar2 = (r.b) this.f3636c;
        bVar2.f9257i = false;
        bVar2.f9258j = z9;
        if (bVar2.f9249a == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar2.f9250b == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && eVar2.L > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && eVar2.L > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        int[] iArr2 = eVar2.f8833l;
        if (z12 && iArr2[0] == 4) {
            bVar2.f9249a = 1;
        }
        if (z13 && iArr2[1] == 4) {
            bVar2.f9250b = 1;
        }
        eVar.a(eVar2, bVar2);
        eVar2.z(((r.b) this.f3636c).f9253e);
        eVar2.w(((r.b) this.f3636c).f9254f);
        Object obj = this.f3636c;
        r.b bVar3 = (r.b) obj;
        eVar2.f8843w = bVar3.f9256h;
        int i10 = bVar3.f9255g;
        eVar2.P = i10;
        if (i10 <= 0) {
            z14 = false;
        }
        eVar2.f8843w = z14;
        r.b bVar4 = (r.b) obj;
        bVar4.f9258j = false;
        return bVar4.f9257i;
    }

    public final String u() {
        if (r()) {
            String str = (String) this.f3637d;
            this.f3637d = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void v(Exception exc, boolean z9) {
        int i10;
        this.f3636c = null;
        r6.o0 j4 = r6.o0.j((Set) this.f3635b);
        ((Set) this.f3635b).clear();
        r6.m0 listIterator = j4.listIterator(0);
        while (listIterator.hasNext()) {
            o1.d dVar = (o1.d) listIterator.next();
            dVar.getClass();
            if (z9) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            dVar.k(i10, exc);
        }
    }

    public final void w(o1.d dVar) {
        ((Set) this.f3635b).add(dVar);
        if (((o1.d) this.f3636c) != null) {
            return;
        }
        this.f3636c = dVar;
        o1.x f10 = dVar.f8114b.f();
        dVar.f8136y = f10;
        o1.a aVar = dVar.f8130s;
        int i10 = f1.b0.f3799a;
        f10.getClass();
        aVar.getClass();
        aVar.obtainMessage(0, new o1.b(v1.n.f10478b.getAndIncrement(), true, SystemClock.elapsedRealtime(), f10)).sendToTarget();
    }

    public final void x(q.f fVar, int i10, int i11) {
        int i12 = fVar.Q;
        int i13 = fVar.R;
        fVar.Q = 0;
        fVar.R = 0;
        fVar.z(i10);
        fVar.w(i11);
        if (i12 < 0) {
            fVar.Q = 0;
        } else {
            fVar.Q = i12;
        }
        if (i13 < 0) {
            fVar.R = 0;
        } else {
            fVar.R = i13;
        }
        ((q.f) this.f3637d).F();
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10) {
        this.f3634a = i10;
        this.f3637d = obj;
        this.f3635b = obj2;
        this.f3636c = obj3;
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f3634a = i10;
        this.f3635b = obj;
        this.f3636c = obj2;
        this.f3637d = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(x7.g gVar, x7.c cVar, int i10) {
        this(gVar, cVar);
        this.f3634a = 20;
    }

    public c(String str) {
        this.f3634a = 12;
        this.f3635b = new c1.v(a3.g.k(str));
    }

    public c(d2.s sVar) {
        this.f3634a = 10;
        this.f3635b = sVar;
    }

    public c(Context context, LocationManager locationManager) {
        this.f3634a = 1;
        this.f3637d = new r0();
        this.f3635b = context;
        this.f3636c = locationManager;
    }

    public c(q.f fVar) {
        this.f3634a = 2;
        this.f3635b = new ArrayList();
        this.f3636c = new r.b();
        this.f3637d = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(d1.d[] dVarArr) {
        this(dVarArr, new b1(), new d1.g());
        this.f3634a = 6;
    }

    public c(d1.d[] dVarArr, b1 b1Var, d1.g gVar) {
        this.f3634a = 6;
        d1.d[] dVarArr2 = new d1.d[dVarArr.length + 2];
        this.f3635b = dVarArr2;
        System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
        this.f3636c = b1Var;
        this.f3637d = gVar;
        d1.d[] dVarArr3 = (d1.d[]) this.f3635b;
        dVarArr3[dVarArr.length] = b1Var;
        dVarArr3[dVarArr.length + 1] = gVar;
    }

    public c(x7.g gVar, x7.c cVar) {
        this.f3634a = 20;
        this.f3635b = gVar;
        this.f3636c = cVar;
    }

    public c(y3.h hVar, p4.j jVar, List list) {
        this.f3634a = 14;
        w7.b.q(hVar);
        this.f3636c = hVar;
        w7.b.q(list);
        this.f3637d = list;
        this.f3635b = new com.bumptech.glide.load.data.n(jVar, hVar);
    }

    public c(ParcelFileDescriptor parcelFileDescriptor, List list, y3.h hVar) {
        this.f3634a = 15;
        w7.b.q(hVar);
        this.f3635b = hVar;
        w7.b.q(list);
        this.f3636c = list;
        this.f3637d = new com.bumptech.glide.load.data.n(parcelFileDescriptor);
    }

    public c(j1.l lVar) {
        this.f3634a = 11;
        this.f3635b = lVar;
        this.f3636c = new AtomicBoolean(false);
    }

    public c(o1.i iVar) {
        this.f3634a = 8;
        this.f3637d = iVar;
        this.f3635b = new HashSet();
    }

    public c(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f3634a = 9;
        this.f3636c = arrayDeque;
        this.f3635b = bufferedReader;
    }
}
