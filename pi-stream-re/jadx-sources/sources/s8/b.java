package s8;

import a8.e;
import a8.h;
import android.net.Uri;
import android.util.Log;
import android.widget.TextView;
import androidx.fragment.app.g;
import androidx.lifecycle.q0;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import c1.j0;
import c1.k0;
import c1.y;
import com.google.android.gms.common.api.f;
import d2.n;
import g8.c;
import h1.o;
import j1.d0;
import j3.i0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import msr.pistream.app.ui.player.PlayerActivity;
import r6.n1;
import v1.d1;
import v1.f0;
import v1.o0;
import w8.d;
import y1.i;
import y1.j;
import y1.p;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final PlayerActivity f9933a;

    /* renamed from: b, reason: collision with root package name */
    public final n8.a f9934b;

    /* renamed from: e, reason: collision with root package name */
    public d0 f9937e;

    /* renamed from: f, reason: collision with root package name */
    public i0 f9938f;

    /* renamed from: g, reason: collision with root package name */
    public int f9939g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9943k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9944l;

    /* renamed from: n, reason: collision with root package name */
    public long f9946n;
    public e o;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9935c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9936d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f9940h = -1;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9941i = false;

    /* renamed from: j, reason: collision with root package name */
    public String f9942j = "AUTO";

    /* renamed from: m, reason: collision with root package name */
    public boolean f9945m = true;

    /* renamed from: p, reason: collision with root package name */
    public final HashSet f9947p = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    public boolean f9948q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9949r = false;

    public b(PlayerActivity playerActivity, n8.a aVar) {
        this.f9933a = playerActivity;
        this.f9934b = aVar;
    }

    public final void a() {
        d0 d0Var;
        i0 i0Var = this.f9938f;
        if (i0Var != null && (d0Var = this.f9937e) != null) {
            i0Var.setPlayer(d0Var);
        }
    }

    public final void b(int i10) {
        try {
            d0 d0Var = this.f9937e;
            if (d0Var != null) {
                d0Var.h0();
                if (d0Var.f5678h instanceof p) {
                    d0 d0Var2 = this.f9937e;
                    d0Var2.h0();
                    p pVar = (p) d0Var2.f5678h;
                    if (i10 <= 0) {
                        i d10 = pVar.d();
                        d10.f1735a = f.API_PRIORITY_OTHER;
                        d10.f1736b = f.API_PRIORITY_OTHER;
                        pVar.o(new j(d10));
                    } else {
                        i d11 = pVar.d();
                        d11.f1735a = f.API_PRIORITY_OTHER;
                        d11.f1736b = i10;
                        pVar.o(new j(d11));
                    }
                    d.f11049e = "QualityHeight:" + i10;
                }
            }
        } catch (Exception e10) {
            Log.e("PlaybackManager", "forceVideoHeight", e10);
        }
    }

    public final void c() {
        this.f9944l = true;
        n8.a aVar = this.f9934b;
        c cVar = aVar.f8024b.V;
        if (cVar != null) {
            cVar.setVisibility(0);
        }
        this.f9935c.clear();
        this.f9940h = -1;
        this.f9941i = false;
        this.f9947p.clear();
        this.f9948q = false;
        this.f9949r = false;
        aVar.v();
        this.f9945m = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0350 A[Catch: Exception -> 0x0360, TryCatch #0 {Exception -> 0x0360, blocks: (B:112:0x0297, B:122:0x0350, B:123:0x0357), top: B:111:0x0297 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[Catch: Exception -> 0x00cd, TryCatch #1 {Exception -> 0x00cd, blocks: (B:198:0x0062, B:200:0x0066, B:202:0x0070, B:25:0x0079, B:27:0x007d, B:29:0x0083, B:31:0x008b, B:33:0x0091, B:35:0x009b, B:37:0x00a7, B:39:0x00ad, B:40:0x00b4), top: B:197:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.b.d(java.lang.String, boolean):void");
    }

    public final void e(Uri uri, ArrayList arrayList) {
        String str;
        boolean z9;
        String str2;
        v1.a o0Var;
        String str3;
        this.f9944l = true;
        d.f11051g = "PlayingOffline";
        n8.a aVar = this.f9934b;
        c cVar = aVar.f8024b.V;
        int i10 = 0;
        if (cVar != null) {
            cVar.setVisibility(0);
        }
        if (uri != null) {
            str = uri.toString().toLowerCase(Locale.US);
        } else {
            str = "";
        }
        boolean contains = str.contains(".mpd");
        if (!contains && str.contains(".m3u8")) {
            z9 = true;
        } else {
            z9 = false;
        }
        y yVar = new y();
        yVar.f1953b = uri;
        if (contains) {
            str2 = "application/dash+xml";
        } else if (z9) {
            str2 = "application/x-mpegURL";
        } else {
            str2 = "video/mp4";
        }
        yVar.f1954c = str2;
        k0 a10 = yVar.a();
        o oVar = new o();
        if (contains) {
            o0Var = new DashMediaSource$Factory(oVar).a(a10);
        } else if (z9) {
            o0Var = new HlsMediaSource$Factory(oVar).a(a10);
        } else {
            w.f fVar = new w.f(new n(), 13);
            g gVar = new g();
            q0 q0Var = new q0(i10);
            a10.f1769b.getClass();
            o0Var = new o0(a10, oVar, fVar, gVar.b(a10), q0Var, 1048576);
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(o0Var);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                if (uri2 != null) {
                    String lowerCase = uri2.toString().toLowerCase(Locale.US);
                    c1.i0 i0Var = new c1.i0(uri2);
                    if (lowerCase.contains(".srt")) {
                        str3 = "application/x-subrip";
                    } else {
                        str3 = "text/vtt";
                    }
                    i0Var.f1715d = c1.q0.o(str3);
                    i0Var.f1716e = "eng";
                    i0Var.f1717f = "Subtitle";
                    arrayList2.add(new d1(null, new j0(i0Var), oVar, new q0(i10), true, null));
                }
            }
            o0Var = new f0((v1.a[]) arrayList2.toArray(new v1.a[0]));
        }
        if (this.f9937e == null) {
            j1.o oVar2 = new j1.o(this.f9933a);
            w7.b.u(!oVar2.f5856t);
            oVar2.f5856t = true;
            d0 d0Var = new d0(oVar2);
            this.f9937e = d0Var;
            d0Var.f5683l.a(new a(this, i10));
        }
        a();
        aVar.f8024b.C.b();
        this.f9937e.T(o0Var);
        this.f9937e.P();
        long j4 = this.f9946n;
        if (j4 > 0) {
            this.f9937e.j(5, j4);
            this.f9946n = 0L;
        }
        d0 d0Var2 = this.f9937e;
        d0Var2.getClass();
        d0Var2.V(true);
    }

    public final int f() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9935c;
            if (i10 < arrayList.size()) {
                if (this.f9943k == this.f9934b.f8024b.N.b((h) arrayList.get(i10))) {
                    return i10;
                }
                i10++;
            } else {
                if (!arrayList.isEmpty()) {
                    return 0;
                }
                return -1;
            }
        }
    }

    public final void g(e eVar) {
        int c6 = this.f9934b.f8024b.H.c(eVar);
        if (c6 < 0) {
            return;
        }
        this.f9939g = c6;
        PlayerActivity playerActivity = this.f9934b.f8024b;
        playerActivity.L.a(playerActivity, playerActivity.T, playerActivity.S);
        this.o = (e) this.f9936d.get(this.f9939g);
        this.f9946n = 0L;
        o1.d0 d0Var = this.f9934b.f8024b.G;
        ((List) d0Var.f8140d).clear();
        d0Var.f8139c = "";
        d0Var.f8137a = false;
        TextView textView = ((n8.a) d0Var.f8138b).f8024b.f7762m0;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerActivity playerActivity2 = this.f9934b.f8024b;
        e eVar2 = playerActivity2.f7775y.o;
        TextView textView2 = playerActivity2.f7753d0;
        if (textView2 != null) {
            textView2.setText(com.bumptech.glide.d.R(eVar2));
        }
        TextView textView3 = playerActivity2.f7754e0;
        if (textView3 != null) {
            textView3.setText(com.bumptech.glide.d.h0(eVar2));
        }
        playerActivity2.A.C();
        PlayerActivity playerActivity3 = this.f9934b.f8024b;
        z3.e eVar3 = playerActivity3.A;
        b bVar = playerActivity3.f7775y;
        eVar3.J(bVar.f9939g, bVar.f9936d.size());
        d0 d0Var2 = this.f9937e;
        if (d0Var2 != null) {
            d0Var2.h0();
            d0Var2.f5696z.e(1, d0Var2.E());
            d0Var2.b0(null);
            n1 n1Var = n1.f9497e;
            long j4 = d0Var2.f5675f0.f5652r;
            d0Var2.f5665a0 = new e1.c(n1Var);
        }
        c();
        n8.a aVar = this.f9934b;
        e eVar4 = this.o;
        PlayerActivity playerActivity4 = aVar.f8024b;
        playerActivity4.f7773x.d(eVar4);
        playerActivity4.B();
        this.f9934b.u();
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f9935c.size(); i10++) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public final void i(int i10, boolean z9, boolean z10) {
        long j4;
        d0 d0Var;
        d0 d0Var2;
        if (i10 >= 0) {
            ArrayList arrayList = this.f9935c;
            if (i10 < arrayList.size()) {
                if (!this.f9948q) {
                    this.f9947p.remove(Integer.valueOf(i10));
                }
                StringBuilder u9 = a3.g.u("ServerSwitch:", i10, "/");
                u9.append(arrayList.size());
                d.f11049e = u9.toString();
                if (z10 && (d0Var2 = this.f9937e) != null) {
                    j4 = d0Var2.y();
                } else {
                    j4 = 0;
                }
                this.f9940h = i10;
                this.f9942j = "AUTO";
                n8.a aVar = this.f9934b;
                PlayerActivity playerActivity = aVar.f8024b;
                TextView textView = playerActivity.f7752c0;
                if (textView != null) {
                    ArrayList arrayList2 = playerActivity.R;
                    int i11 = playerActivity.f7774x0;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i12 = 0; i12 < playerActivity.R.size(); i12++) {
                        arrayList3.add(Integer.valueOf(i12));
                    }
                    textView.setText(com.bumptech.glide.d.q(arrayList2, i11));
                }
                aVar.I();
                aVar.v();
                d(((h) arrayList.get(i10)).f199b, z9);
                if (j4 > 0 && (d0Var = this.f9937e) != null) {
                    d0Var.j(5, j4);
                }
            }
        }
    }

    public final void j() {
        d0 d0Var = this.f9937e;
        if (d0Var == null) {
            return;
        }
        if (d0Var.h()) {
            d0 d0Var2 = this.f9937e;
            d0Var2.getClass();
            d0Var2.V(false);
        } else {
            d0 d0Var3 = this.f9937e;
            d0Var3.getClass();
            d0Var3.V(true);
        }
        this.f9934b.f8024b.A.K();
    }
}
