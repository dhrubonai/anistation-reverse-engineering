package s1;

/* loaded from: classes.dex */
public final class q extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f9809a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9810b;

    /* renamed from: c, reason: collision with root package name */
    public final n f9811c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9812d;

    public q(int i10, c1.v vVar, w wVar, boolean z9) {
        this("Decoder init failed: [" + i10 + "], " + vVar, wVar, vVar.f1935m, z9, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public q(String str, Throwable th, String str2, boolean z9, n nVar, String str3) {
        super(str, th);
        this.f9809a = str2;
        this.f9810b = z9;
        this.f9811c = nVar;
        this.f9812d = str3;
    }
}
