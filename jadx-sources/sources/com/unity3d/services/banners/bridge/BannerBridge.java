package com.unity3d.services.banners.bridge;

import android.view.View;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceProvider;
import defpackage.pv6;
import gatewayprotocol.v1.ErrorOuterClass;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class BannerBridge {
    public static final BannerBridge INSTANCE = new BannerBridge();

    private BannerBridge() {
    }

    private final boolean isHeaderBidding(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(LegacyLoadUseCase.KEY_AD_MARKUP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onBannerLoaded(BannerView bannerView, final String str, final String str2, final UnityAdsLoadOptions unityAdsLoadOptions) {
        final BannerView bannerView2;
        final BannerView.IListener listener = bannerView.getListener();
        final BannerView bannerView3 = BannerViewCache.getInstance().getBannerView(str);
        if (bannerView3 == null) {
            if (listener != null) {
                listener.onBannerFailedToLoad(bannerView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                return;
            }
            return;
        }
        int i = pv6.a;
        if (bannerView3.isAttachedToWindow()) {
            if (BannerViewCache.getInstance().getBannerView(str) == null) {
                if (listener instanceof BannerShowListenerWithOnFailedToShow) {
                    ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                }
            } else {
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(unityAdsLoadOptions.getObjectId());
                LoadConfigurationInternal loadConfigurationInternal = unityAdsLoadOptions.loadConfiguration;
                IServiceProvider iServiceProvider = null;
                Object[] objArr = 0;
                if (loadConfigurationInternal != null) {
                    unityAdsShowOptions.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                }
                new UnityAdsSDK(iServiceProvider, 1, objArr == true ? 1 : 0).show(str2, unityAdsShowOptions, new BannerBridge$onBannerLoaded$1$2(listener, bannerView));
            }
            bannerView2 = bannerView;
        } else {
            bannerView2 = bannerView;
            bannerView3.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$onBannerLoaded$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    view.getClass();
                    bannerView3.removeOnAttachStateChangeListener(this);
                    if (BannerViewCache.getInstance().getBannerView(str) == null) {
                        BannerView.IListener iListener = listener;
                        if (iListener instanceof BannerShowListenerWithOnFailedToShow) {
                            iListener.getClass();
                            ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerView2, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                            return;
                        }
                        return;
                    }
                    UnityAdsShowOptions unityAdsShowOptions2 = new UnityAdsShowOptions();
                    unityAdsShowOptions2.setObjectId(unityAdsLoadOptions.getObjectId());
                    if (unityAdsLoadOptions.loadConfiguration != null) {
                        unityAdsShowOptions2.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                    }
                    new UnityAdsSDK(null, 1, null).show(str2, unityAdsShowOptions2, new BannerBridge$onBannerLoaded$1$2(listener, bannerView2));
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    view.getClass();
                }
            });
        }
        if (listener != null) {
            listener.onBannerLoaded(bannerView2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void load(final String str, final String str2, UnityBannerSize unityBannerSize, final UnityAdsLoadOptions unityAdsLoadOptions) {
        unityAdsLoadOptions.getClass();
        final BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null) {
            return;
        }
        if (unityAdsLoadOptions.getObjectId() == null) {
            unityAdsLoadOptions.setObjectId(str2);
        }
        new UnityAdsSDK(null, 1, 0 == true ? 1 : 0).load(str, unityAdsLoadOptions, new InternalLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$load$listener$1
            @Override // com.unity3d.ads.core.domain.InternalLoadListener
            public void onAdLoadFail(UnityAdsError unityAdsError) {
                unityAdsError.getClass();
                BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(str2);
                if (bannerView2 != null && bannerView2.getListener() != null) {
                    bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(unityAdsError));
                }
            }

            @Override // com.unity3d.ads.core.domain.InternalLoadListener
            public void onAdLoaded(AdObject adObject) {
                adObject.getClass();
                BannerBridge.INSTANCE.onBannerLoaded(bannerView, str2, str, unityAdsLoadOptions);
            }
        }, unityBannerSize);
    }

    public static final void destroy(String str) {
    }

    public static final void didAttach(String str) {
    }

    public static final void didDestroy(String str) {
    }

    public static final void didDetach(String str) {
    }

    public static final void didLoad(String str) {
    }

    public static final void visibilityChanged(String str, int i) {
    }

    public static final void resize(String str, int i, int i2, int i3, int i4, float f) {
    }
}
