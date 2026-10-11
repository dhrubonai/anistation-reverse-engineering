package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import e4.v;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2270a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2271b;

    public n(InputStream inputStream, y3.h hVar) {
        v vVar = new v(inputStream, hVar);
        this.f2271b = vVar;
        vVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.g
    public final Object a() {
        int i10 = this.f2270a;
        Object obj = this.f2271b;
        switch (i10) {
            case 0:
                return b();
            case 1:
                return obj;
            default:
                v vVar = (v) obj;
                vVar.reset();
                return vVar;
        }
    }

    public final ParcelFileDescriptor b() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f2271b).rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public final void c() {
        switch (this.f2270a) {
            case 0:
            case 1:
                return;
            default:
                ((v) this.f2271b).f();
                return;
        }
    }

    public n(ParcelFileDescriptor parcelFileDescriptor) {
        this.f2271b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public n(Object obj) {
        this.f2271b = obj;
    }
}
