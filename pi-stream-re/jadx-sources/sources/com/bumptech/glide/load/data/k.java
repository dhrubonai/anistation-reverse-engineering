package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(AssetManager assetManager, String str, int i10) {
        super(assetManager, str, 0);
        this.f2263e = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f2263e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void b(Object obj) {
        switch (this.f2263e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Closeable f(AssetManager assetManager, String str) {
        switch (this.f2263e) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
