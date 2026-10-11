package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import defpackage.d46;
import defpackage.m9;
import defpackage.n;
import defpackage.nj2;
import defpackage.q23;
import defpackage.qx5;
import defpackage.rb3;
import defpackage.t85;
import defpackage.vz0;
import defpackage.w11;
import defpackage.wc7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final rb3 measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers iSDKDispatchers, SessionRepository sessionRepository) {
        context.getClass();
        iSDKDispatchers.getClass();
        sessionRepository.getClass();
        this.dispatchers = iSDKDispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = new d46(new n(this, context, (byte) 1));
    }

    public final MeasurementManager getMeasurementManager(Context context) {
        int extensionVersion;
        if (Device.getApiLevel() >= 33) {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            if (extensionVersion < 4) {
                return null;
            }
            return m9.c(context.getSystemService(nj2.o()));
        }
        return null;
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri parse = Uri.parse(str);
        parse.getClass();
        Uri build = parse.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        build.getClass();
        return build;
    }

    public final Object isAvailable(vz0 vz0Var) {
        int extensionVersion;
        boolean isAdServicesStateEnabled;
        if (Device.getApiLevel() >= 33) {
            extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            if (extensionVersion < 4) {
                return Boolean.FALSE;
            }
            if (getMeasurementManager() != null) {
                isAdServicesStateEnabled = AdServicesState.isAdServicesStateEnabled();
                if (!isAdServicesStateEnabled) {
                    return Boolean.FALSE;
                }
                final t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
                MeasurementManager measurementManager = getMeasurementManager();
                if (measurementManager != null) {
                    measurementManager.getMeasurementApiStatus(q23.e(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                        public void onError(Exception exc) {
                            exc.getClass();
                            vz0.this.resumeWith(Boolean.FALSE);
                        }

                        public void onResult(int i) {
                            vz0 vz0Var2 = vz0.this;
                            boolean z = true;
                            if (i != 1) {
                                z = false;
                            }
                            vz0Var2.resumeWith(Boolean.valueOf(z));
                        }

                        public /* bridge */ /* synthetic */ void onResult(Object obj) {
                            onResult(((Number) obj).intValue());
                        }
                    });
                } else {
                    t85Var.resumeWith(Boolean.FALSE);
                }
                return t85Var.b();
            }
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }

    public final Object registerClick(String str, AdObject adObject, vz0 vz0Var) {
        WebViewContainer webViewContainer;
        qx5 lastInputEvent;
        InputEvent inputEvent;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (webViewContainer = adPlayer.getWebViewContainer()) != null && (lastInputEvent = webViewContainer.getLastInputEvent()) != null && (inputEvent = (InputEvent) lastInputEvent.getValue()) != null) {
            final t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
            MeasurementManager measurementManager = getMeasurementManager();
            if (measurementManager != null) {
                measurementManager.registerSource(getUri(str, adObject), inputEvent, q23.e(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                    public void onError(Exception exc) {
                        exc.getClass();
                        vz0.this.resumeWith(Boolean.FALSE);
                    }

                    public void onResult(Object obj) {
                        obj.getClass();
                        vz0.this.resumeWith(Boolean.TRUE);
                    }
                });
            } else {
                t85Var.resumeWith(Boolean.FALSE);
            }
            return t85Var.b();
        }
        return Boolean.FALSE;
    }

    public final Object registerView(String str, AdObject adObject, vz0 vz0Var) {
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        final t85 t85Var = new t85(wc7.z(vz0Var), w11.y);
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, q23.e(this.dispatchers.getDefault()), new OutcomeReceiver() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                public void onError(Exception exc) {
                    exc.getClass();
                    vz0.this.resumeWith(Boolean.FALSE);
                }

                public void onResult(Object obj) {
                    obj.getClass();
                    vz0.this.resumeWith(Boolean.TRUE);
                }
            });
        } else {
            t85Var.resumeWith(Boolean.FALSE);
        }
        return t85Var.b();
    }

    private final MeasurementManager getMeasurementManager() {
        return m9.c(this.measurementManager$delegate.getValue());
    }
}
