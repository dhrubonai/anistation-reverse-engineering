package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import q0.v;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2256a;

    public /* synthetic */ h(int i10) {
        this.f2256a = i10;
    }

    @Override // com.bumptech.glide.load.data.f
    public final Class a() {
        switch (this.f2256a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }

    @Override // com.bumptech.glide.load.data.f
    public final g b(Object obj) {
        switch (this.f2256a) {
            case 0:
                return new n(obj);
            case 1:
                return new n((ParcelFileDescriptor) obj);
            default:
                return new v((ByteBuffer) obj);
        }
    }
}
