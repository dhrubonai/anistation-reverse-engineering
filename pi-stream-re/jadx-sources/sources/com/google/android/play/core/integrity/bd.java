package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    private final ax f2922a;

    public bd(ax axVar) {
        this.f2922a = axVar;
    }

    public final /* synthetic */ Task a(long j4, long j10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f2922a.c(standardIntegrityTokenRequest.a(), j4, j10);
    }
}
