package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.FocusRepository;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.log.Logger;
import defpackage.bf6;
import defpackage.cf6;
import defpackage.db;
import defpackage.fq1;
import defpackage.h95;
import defpackage.iv;
import defpackage.iv5;
import defpackage.k52;
import defpackage.n11;
import defpackage.o11;
import defpackage.p11;
import defpackage.q71;
import defpackage.sx5;
import defpackage.tl7;
import defpackage.tx5;
import defpackage.x44;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidHandleFocusCounters {
    private final p11 coroutineExceptionHandler;
    private final n11 defaultDispatcher;
    private final FocusRepository focusRepository;
    private final ConcurrentHashMap<String, bf6> focusTimesPerActivity;
    private final AndroidGetIsAdActivity isAdActivity;
    private volatile String latestKnownActivityResumed;
    private final Logger logger;
    private final x44 previousFocusState;
    private final SessionRepository sessionRepository;
    private final cf6 timeSource;

    public AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, n11 n11Var, Logger logger, cf6 cf6Var) {
        sessionRepository.getClass();
        focusRepository.getClass();
        androidGetIsAdActivity.getClass();
        n11Var.getClass();
        logger.getClass();
        cf6Var.getClass();
        this.sessionRepository = sessionRepository;
        this.focusRepository = focusRepository;
        this.isAdActivity = androidGetIsAdActivity;
        this.defaultDispatcher = n11Var;
        this.logger = logger;
        this.timeSource = cf6Var;
        this.focusTimesPerActivity = new ConcurrentHashMap<>();
        this.previousFocusState = tx5.a(null);
        this.coroutineExceptionHandler = new AndroidHandleFocusCounters$special$$inlined$CoroutineExceptionHandler$1(o11.x, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFocusStateChange(FocusState focusState) {
        sx5 sx5Var;
        Object value;
        FocusState focusState2;
        x44 x44Var = this.previousFocusState;
        do {
            sx5Var = (sx5) x44Var;
            value = sx5Var.getValue();
            focusState2 = (FocusState) value;
        } while (!sx5Var.j(value, focusState));
        if (focusState2 != null && focusState.getClass() != focusState2.getClass()) {
            this.sessionRepository.incrementFocusChangeCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPause(String str) {
        String str2 = this.latestKnownActivityResumed;
        if (str2 != null && !str2.equals(str)) {
            return;
        }
        bf6 remove = this.focusTimesPerActivity.remove(str);
        if (remove == null) {
            remove = this.timeSource.a();
        }
        this.sessionRepository.addTimeToGlobalAdsFocusTime((int) fq1.d(bf6.b(remove.x)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResume(String str) {
        this.latestKnownActivityResumed = str;
        this.focusTimesPerActivity.put(str, this.timeSource.a());
    }

    public final String getLatestKnownActivityResumed() {
        return this.latestKnownActivityResumed;
    }

    public final void invoke() {
        iv.G(new k52(this.focusRepository.getFocusState(), new AndroidHandleFocusCounters$invoke$1(this, null), (byte) 2), db.b(tl7.L(iv5.a(), this.defaultDispatcher).plus(this.coroutineExceptionHandler)));
    }

    public final void setLatestKnownActivityResumed(String str) {
        this.latestKnownActivityResumed = str;
    }

    public static /* synthetic */ void getLatestKnownActivityResumed$annotations() {
    }

    public /* synthetic */ AndroidHandleFocusCounters(SessionRepository sessionRepository, FocusRepository focusRepository, AndroidGetIsAdActivity androidGetIsAdActivity, n11 n11Var, Logger logger, cf6 cf6Var, int i, q71 q71Var) {
        this(sessionRepository, focusRepository, androidGetIsAdActivity, n11Var, logger, (i & 32) != 0 ? h95.N : cf6Var);
    }
}
