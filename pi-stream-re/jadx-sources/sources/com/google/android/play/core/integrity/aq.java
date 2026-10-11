package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class aq extends p6.w {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f2892a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f2893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(ax axVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f2893b = axVar;
        this.f2892a = context;
    }

    @Override // p6.w
    public final void b() {
        TaskCompletionSource taskCompletionSource;
        taskCompletionSource = this.f2893b.f2910d;
        taskCompletionSource.trySetResult(Boolean.valueOf(p6.e.a(this.f2892a)));
    }
}
