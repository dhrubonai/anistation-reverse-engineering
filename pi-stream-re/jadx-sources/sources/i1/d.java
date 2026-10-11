package i1;

import android.media.MediaCodec;
import f1.b0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5250a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5251b;

    /* renamed from: c, reason: collision with root package name */
    public int f5252c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f5253d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f5254e;

    /* renamed from: f, reason: collision with root package name */
    public int f5255f;

    /* renamed from: g, reason: collision with root package name */
    public int f5256g;

    /* renamed from: h, reason: collision with root package name */
    public int f5257h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f5258i;

    /* renamed from: j, reason: collision with root package name */
    public final c f5259j;

    public d() {
        c cVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f5258i = cryptoInfo;
        if (b0.f3799a >= 24) {
            cVar = new c(cryptoInfo);
        } else {
            cVar = null;
        }
        this.f5259j = cVar;
    }
}
