package s;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f9646a;

    /* renamed from: b, reason: collision with root package name */
    public final k f9647b = new k();

    /* renamed from: c, reason: collision with root package name */
    public final j f9648c = new j();

    /* renamed from: d, reason: collision with root package name */
    public final i f9649d = new i();

    /* renamed from: e, reason: collision with root package name */
    public final l f9650e = new l();

    /* renamed from: f, reason: collision with root package name */
    public HashMap f9651f = new HashMap();

    public final void a(d dVar) {
        i iVar = this.f9649d;
        dVar.f9602d = iVar.f9665g;
        dVar.f9604e = iVar.f9667h;
        dVar.f9606f = iVar.f9669i;
        dVar.f9608g = iVar.f9671j;
        dVar.f9610h = iVar.f9672k;
        dVar.f9612i = iVar.f9673l;
        dVar.f9614j = iVar.f9674m;
        dVar.f9616k = iVar.f9675n;
        dVar.f9618l = iVar.o;
        dVar.f9621p = iVar.f9676p;
        dVar.f9622q = iVar.f9677q;
        dVar.f9623r = iVar.f9678r;
        dVar.f9624s = iVar.f9679s;
        ((ViewGroup.MarginLayoutParams) dVar).leftMargin = iVar.C;
        ((ViewGroup.MarginLayoutParams) dVar).rightMargin = iVar.D;
        ((ViewGroup.MarginLayoutParams) dVar).topMargin = iVar.E;
        ((ViewGroup.MarginLayoutParams) dVar).bottomMargin = iVar.F;
        dVar.f9629x = iVar.N;
        dVar.f9630y = iVar.M;
        dVar.f9626u = iVar.J;
        dVar.f9628w = iVar.L;
        dVar.f9631z = iVar.f9680t;
        dVar.A = iVar.f9681u;
        dVar.f9619m = iVar.f9683w;
        dVar.f9620n = iVar.f9684x;
        dVar.o = iVar.f9685y;
        dVar.B = iVar.f9682v;
        dVar.P = iVar.f9686z;
        dVar.Q = iVar.A;
        dVar.E = iVar.O;
        dVar.D = iVar.P;
        dVar.G = iVar.R;
        dVar.F = iVar.Q;
        dVar.S = iVar.f9666g0;
        dVar.T = iVar.f9668h0;
        dVar.H = iVar.S;
        dVar.I = iVar.T;
        dVar.L = iVar.U;
        dVar.M = iVar.V;
        dVar.J = iVar.W;
        dVar.K = iVar.X;
        dVar.N = iVar.Y;
        dVar.O = iVar.Z;
        dVar.R = iVar.B;
        dVar.f9600c = iVar.f9663f;
        dVar.f9596a = iVar.f9659d;
        dVar.f9598b = iVar.f9661e;
        ((ViewGroup.MarginLayoutParams) dVar).width = iVar.f9655b;
        ((ViewGroup.MarginLayoutParams) dVar).height = iVar.f9657c;
        String str = iVar.f9664f0;
        if (str != null) {
            dVar.U = str;
        }
        dVar.setMarginStart(iVar.H);
        dVar.setMarginEnd(iVar.G);
        dVar.a();
    }

    public final Object clone() {
        h hVar = new h();
        i iVar = hVar.f9649d;
        iVar.getClass();
        i iVar2 = this.f9649d;
        iVar.f9653a = iVar2.f9653a;
        iVar.f9655b = iVar2.f9655b;
        iVar.f9657c = iVar2.f9657c;
        iVar.f9659d = iVar2.f9659d;
        iVar.f9661e = iVar2.f9661e;
        iVar.f9663f = iVar2.f9663f;
        iVar.f9665g = iVar2.f9665g;
        iVar.f9667h = iVar2.f9667h;
        iVar.f9669i = iVar2.f9669i;
        iVar.f9671j = iVar2.f9671j;
        iVar.f9672k = iVar2.f9672k;
        iVar.f9673l = iVar2.f9673l;
        iVar.f9674m = iVar2.f9674m;
        iVar.f9675n = iVar2.f9675n;
        iVar.o = iVar2.o;
        iVar.f9676p = iVar2.f9676p;
        iVar.f9677q = iVar2.f9677q;
        iVar.f9678r = iVar2.f9678r;
        iVar.f9679s = iVar2.f9679s;
        iVar.f9680t = iVar2.f9680t;
        iVar.f9681u = iVar2.f9681u;
        iVar.f9682v = iVar2.f9682v;
        iVar.f9683w = iVar2.f9683w;
        iVar.f9684x = iVar2.f9684x;
        iVar.f9685y = iVar2.f9685y;
        iVar.f9686z = iVar2.f9686z;
        iVar.A = iVar2.A;
        iVar.B = iVar2.B;
        iVar.C = iVar2.C;
        iVar.D = iVar2.D;
        iVar.E = iVar2.E;
        iVar.F = iVar2.F;
        iVar.G = iVar2.G;
        iVar.H = iVar2.H;
        iVar.I = iVar2.I;
        iVar.J = iVar2.J;
        iVar.K = iVar2.K;
        iVar.L = iVar2.L;
        iVar.M = iVar2.M;
        iVar.N = iVar2.N;
        iVar.O = iVar2.O;
        iVar.P = iVar2.P;
        iVar.Q = iVar2.Q;
        iVar.R = iVar2.R;
        iVar.S = iVar2.S;
        iVar.T = iVar2.T;
        iVar.U = iVar2.U;
        iVar.V = iVar2.V;
        iVar.W = iVar2.W;
        iVar.X = iVar2.X;
        iVar.Y = iVar2.Y;
        iVar.Z = iVar2.Z;
        iVar.f9654a0 = iVar2.f9654a0;
        iVar.f9656b0 = iVar2.f9656b0;
        iVar.f9658c0 = iVar2.f9658c0;
        iVar.f9664f0 = iVar2.f9664f0;
        int[] iArr = iVar2.f9660d0;
        if (iArr != null) {
            iVar.f9660d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            iVar.f9660d0 = null;
        }
        iVar.f9662e0 = iVar2.f9662e0;
        iVar.f9666g0 = iVar2.f9666g0;
        iVar.f9668h0 = iVar2.f9668h0;
        iVar.f9670i0 = iVar2.f9670i0;
        j jVar = hVar.f9648c;
        jVar.getClass();
        j jVar2 = this.f9648c;
        jVar2.getClass();
        jVar.f9688a = jVar2.f9688a;
        jVar.f9689b = jVar2.f9689b;
        jVar.f9691d = jVar2.f9691d;
        jVar.f9690c = jVar2.f9690c;
        k kVar = hVar.f9647b;
        kVar.getClass();
        k kVar2 = this.f9647b;
        kVar2.getClass();
        kVar.f9692a = kVar2.f9692a;
        kVar.f9694c = kVar2.f9694c;
        kVar.f9695d = kVar2.f9695d;
        kVar.f9693b = kVar2.f9693b;
        l lVar = hVar.f9650e;
        lVar.getClass();
        l lVar2 = this.f9650e;
        lVar2.getClass();
        lVar.f9697a = lVar2.f9697a;
        lVar.f9698b = lVar2.f9698b;
        lVar.f9699c = lVar2.f9699c;
        lVar.f9700d = lVar2.f9700d;
        lVar.f9701e = lVar2.f9701e;
        lVar.f9702f = lVar2.f9702f;
        lVar.f9703g = lVar2.f9703g;
        lVar.f9704h = lVar2.f9704h;
        lVar.f9705i = lVar2.f9705i;
        lVar.f9706j = lVar2.f9706j;
        lVar.f9707k = lVar2.f9707k;
        lVar.f9708l = lVar2.f9708l;
        hVar.f9646a = this.f9646a;
        return hVar;
    }
}
