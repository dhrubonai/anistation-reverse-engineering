package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2248a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2249b;

    /* renamed from: c, reason: collision with root package name */
    public final Comparable f2250c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2251d;

    public /* synthetic */ b(Object obj, Comparable comparable, int i10) {
        this.f2248a = i10;
        this.f2251d = obj;
        this.f2250c = comparable;
    }

    public abstract void b(Object obj);

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        switch (this.f2248a) {
            case 0:
                Object obj = this.f2249b;
                if (obj != null) {
                    try {
                        b(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            default:
                Object obj2 = this.f2249b;
                if (obj2 != null) {
                    try {
                        b(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, d dVar) {
        int i10 = this.f2248a;
        Comparable comparable = this.f2250c;
        Object obj = this.f2251d;
        switch (i10) {
            case 0:
                try {
                    Closeable f10 = f((AssetManager) obj, (String) comparable);
                    this.f2249b = f10;
                    dVar.s(f10);
                    return;
                } catch (IOException e10) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e10);
                    }
                    dVar.n(e10);
                    return;
                }
            default:
                try {
                    Object g10 = g((ContentResolver) obj, (Uri) comparable);
                    this.f2249b = g10;
                    dVar.s(g10);
                    return;
                } catch (FileNotFoundException e11) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e11);
                    }
                    dVar.n(e11);
                    return;
                }
        }
    }

    public abstract Closeable f(AssetManager assetManager, String str);

    public abstract Object g(ContentResolver contentResolver, Uri uri);
}
