package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.unity3d.ads.core.data.repository.FocusState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import defpackage.ic2;
import defpackage.m37;
import defpackage.pn6;
import defpackage.t36;
import defpackage.vz0;
import defpackage.w51;
import defpackage.z05;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@w51(c = "com.unity3d.ads.core.domain.AndroidHandleFocusCounters$invoke$1", f = "AndroidHandleFocusCounters.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidHandleFocusCounters$invoke$1 extends t36 implements ic2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidHandleFocusCounters this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHandleFocusCounters$invoke$1(AndroidHandleFocusCounters androidHandleFocusCounters, vz0 vz0Var) {
        super(2, vz0Var);
        this.this$0 = androidHandleFocusCounters;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        AndroidHandleFocusCounters$invoke$1 androidHandleFocusCounters$invoke$1 = new AndroidHandleFocusCounters$invoke$1(this.this$0, vz0Var);
        androidHandleFocusCounters$invoke$1.L$0 = obj;
        return androidHandleFocusCounters$invoke$1;
    }

    @Override // defpackage.ic2
    public final Object invoke(FocusState focusState, vz0 vz0Var) {
        return ((AndroidHandleFocusCounters$invoke$1) create(focusState, vz0Var)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        String str;
        AndroidGetIsAdActivity androidGetIsAdActivity;
        SessionRepository sessionRepository;
        if (this.label == 0) {
            m37.N(obj);
            FocusState focusState = (FocusState) this.L$0;
            this.this$0.onFocusStateChange(focusState);
            Activity activity = focusState.getActivity().get();
            if (activity == null || (str = z05.a(activity.getClass()).e()) == null) {
                str = "unknown_activity_name";
            }
            androidGetIsAdActivity = this.this$0.isAdActivity;
            boolean invoke = androidGetIsAdActivity.invoke(str);
            pn6 pn6Var = pn6.a;
            if (invoke) {
                sessionRepository = this.this$0.sessionRepository;
                sessionRepository.incrementGlobalAdsFocusChangeCount();
                if (focusState instanceof FocusState.Focused) {
                    this.this$0.onResume(str);
                    return pn6Var;
                }
                if (focusState instanceof FocusState.Unfocused) {
                    this.this$0.onPause(str);
                    return pn6Var;
                }
                ze0.l();
                return null;
            }
            return pn6Var;
        }
        ze0.m("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
