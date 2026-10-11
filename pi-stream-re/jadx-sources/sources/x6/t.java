package x6;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class t extends b7.g implements h7.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;

    /* renamed from: b, reason: collision with root package name */
    public Object f11330b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f11331c;

    /* renamed from: d, reason: collision with root package name */
    public int f11332d;

    /* renamed from: e, reason: collision with root package name */
    public int f11333e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11334f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11335x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f11336y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Iterator f11337z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i10, int i11, Iterator it, boolean z9, boolean z10, z6.e eVar) {
        super(eVar);
        this.f11335x = i10;
        this.f11336y = i11;
        this.f11337z = it;
        this.A = z9;
        this.B = z10;
    }

    @Override // b7.a
    public final z6.e create(Object obj, z6.e eVar) {
        t tVar = new t(this.f11335x, this.f11336y, this.f11337z, this.A, this.B, eVar);
        tVar.f11334f = obj;
        return tVar;
    }

    @Override // h7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((n7.d) obj, (z6.e) obj2)).invokeSuspend(w6.f.f11019a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0186 -> B:12:0x0189). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0151 -> B:30:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x009d -> B:67:0x00a0). Please report as a decompilation issue!!! */
    @Override // b7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
