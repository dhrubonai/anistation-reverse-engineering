package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
abstract class aw extends p6.w {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ax f2906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ax axVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f2906f = axVar;
    }

    @Override // p6.w
    public final void a(Exception exc) {
        if (!(exc instanceof p6.d)) {
            super.a(exc);
        } else if (ax.g(this.f2906f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
