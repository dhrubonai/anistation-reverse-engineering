package msr.pistream.app.viewmodel;

import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y7.d;
import y7.e;
import y7.f;
import y7.j;

@HiltViewModel
/* loaded from: classes.dex */
public class DetailViewModel extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f7783a;

    /* renamed from: b, reason: collision with root package name */
    public final e f7784b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7785c;

    /* renamed from: d, reason: collision with root package name */
    public final f f7786d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f7787e = Executors.newFixedThreadPool(4);

    /* renamed from: f, reason: collision with root package name */
    public final c0 f7788f = new c0();

    /* renamed from: g, reason: collision with root package name */
    public final c0 f7789g = new c0();

    /* renamed from: h, reason: collision with root package name */
    public final c0 f7790h = new c0();

    /* renamed from: i, reason: collision with root package name */
    public final c0 f7791i = new c0();

    public DetailViewModel(d dVar, e eVar, j jVar, f fVar) {
        new c0();
        this.f7783a = dVar;
        this.f7784b = eVar;
        this.f7785c = jVar;
        this.f7786d = fVar;
    }

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        this.f7787e.shutdown();
    }
}
