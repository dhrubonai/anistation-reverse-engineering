package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AccelerometerRepository;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import defpackage.mx0;
import defpackage.pn6;
import defpackage.vz0;
import defpackage.w11;
import defpackage.w42;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidShow implements Show {
    private final AccelerometerRepository accelerometerRepository;
    private final AdRepository adRepository;
    private final Context context;
    private final GameServerIdReader gameServerIdReader;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final PreShowWebViewStrategy preShowStrategy;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final ValidateExtrasSize validateExtrasSize;

    public AndroidShow(Context context, AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent, ValidateExtrasSize validateExtrasSize, HandleGatewayAdResponse handleGatewayAdResponse, PreShowWebViewStrategy preShowWebViewStrategy, AccelerometerRepository accelerometerRepository) {
        context.getClass();
        adRepository.getClass();
        gameServerIdReader.getClass();
        sendDiagnosticEvent.getClass();
        validateExtrasSize.getClass();
        handleGatewayAdResponse.getClass();
        preShowWebViewStrategy.getClass();
        accelerometerRepository.getClass();
        this.context = context;
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.validateExtrasSize = validateExtrasSize;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.preShowStrategy = preShowWebViewStrategy;
        this.accelerometerRepository = accelerometerRepository;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public w42 invoke(AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        adObject.getClass();
        return new mx0(new AndroidShow$invoke$1(adObject, this, unityAdsShowOptions, null), (byte) 5);
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, vz0 vz0Var) {
        Object destroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        pn6 pn6Var = pn6.a;
        if (adPlayer != null && (destroy = adPlayer.destroy(vz0Var)) == w11.x) {
            return destroy;
        }
        return pn6Var;
    }
}
