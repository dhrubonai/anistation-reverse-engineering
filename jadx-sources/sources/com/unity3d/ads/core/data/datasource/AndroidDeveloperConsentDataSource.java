package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AndroidGetIsModulesInitEnabled;
import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import defpackage.a34;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class AndroidDeveloperConsentDataSource implements DeveloperConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage publicStorage;
    private final SessionRepository sessionRepository;

    public AndroidDeveloperConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage jsonStorage, SessionRepository sessionRepository) {
        flattenerRulesUseCase.getClass();
        jsonStorage.getClass();
        sessionRepository.getClass();
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.publicStorage = jsonStorage;
        this.sessionRepository = sessionRepository;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentOption createDeveloperConsentOption(String str, boolean z) {
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        newBuilder.getClass();
        DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
        _create.setType(getDeveloperConsentType(str));
        if (_create.getType() == DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM) {
            _create.setCustomType(str);
        }
        _create.setValue(getDeveloperConsentChoice(Boolean.valueOf(z)));
        return _create._build();
    }

    private final List<DeveloperConsentOuterClass.DeveloperConsentOption> developerConsentList() {
        DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption;
        ArrayList arrayList = new ArrayList();
        if (this.sessionRepository.getInitializationConfiguration() != null) {
            if (UnityAds.getNonBehavioral() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                newBuilder.getClass();
                DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
                _create.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_NON_BEHAVIORAL);
                _create.setValue(getDeveloperConsentChoice(UnityAds.getNonBehavioral()));
                arrayList.add(_create._build());
            }
            if (UnityAds.getUserConsent() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion2 = DeveloperConsentOptionKt.Dsl.Companion;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder2 = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                newBuilder2.getClass();
                DeveloperConsentOptionKt.Dsl _create2 = companion2._create(newBuilder2);
                _create2.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_CONSENT);
                _create2.setValue(getDeveloperConsentChoice(UnityAds.getUserConsent()));
                arrayList.add(_create2._build());
            }
            if (UnityAds.getUserOptOut() != null) {
                DeveloperConsentOptionKt.Dsl.Companion companion3 = DeveloperConsentOptionKt.Dsl.Companion;
                DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder3 = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
                newBuilder3.getClass();
                DeveloperConsentOptionKt.Dsl _create3 = companion3._create(newBuilder3);
                _create3.setType(DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_SET_USER_OPT_OUT);
                _create3.setValue(getDeveloperConsentChoice(UnityAds.getUserOptOut()));
                arrayList.add(_create3._build());
                return arrayList;
            }
        } else {
            JSONObject fetchData = fetchData();
            Iterator<String> keys = fetchData.keys();
            keys.getClass();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = fetchData.get(next);
                if (obj instanceof Boolean) {
                    next.getClass();
                    developerConsentOption = createDeveloperConsentOption(next, ((Boolean) obj).booleanValue());
                } else {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (str.equalsIgnoreCase(AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE) || str.equalsIgnoreCase("false")) {
                            next.getClass();
                            developerConsentOption = createDeveloperConsentOption(next, Boolean.parseBoolean(str));
                        }
                    }
                    developerConsentOption = null;
                }
                if (developerConsentOption != null) {
                    arrayList.add(developerConsentOption);
                }
            }
        }
        return arrayList;
    }

    private final JSONObject fetchData() {
        if (this.publicStorage.getData() != null) {
            JSONObject flattenJson = new JsonFlattener(this.publicStorage.getData()).flattenJson(".", this.flattenerRulesUseCase.invoke());
            flattenJson.getClass();
            return flattenJson;
        }
        return new JSONObject();
    }

    private final DeveloperConsentOuterClass.DeveloperConsentChoice getDeveloperConsentChoice(Boolean bool) {
        if (a34.i(bool, Boolean.TRUE)) {
            return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_TRUE;
        }
        if (a34.i(bool, Boolean.FALSE)) {
            return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_FALSE;
        }
        return DeveloperConsentOuterClass.DeveloperConsentChoice.DEVELOPER_CONSENT_CHOICE_UNSPECIFIED;
    }

    private final DeveloperConsentOuterClass.DeveloperConsentType getDeveloperConsentType(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1998919769:
                    if (str.equals("user.nonbehavioral")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                    }
                    break;
                case -1078801183:
                    if (str.equals("pipl.consent")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PIPL_CONSENT;
                    }
                    break;
                case -5454905:
                    if (str.equals("user.nonBehavioral")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_NON_BEHAVIORAL;
                    }
                    break;
                case 194451659:
                    if (str.equals("gdpr.consent")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_GDPR_CONSENT;
                    }
                    break;
                case 519433140:
                    if (str.equals("privacy.consent")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_PRIVACY_CONSENT;
                    }
                    break;
                case 2033752033:
                    if (str.equals("privacy.useroveragelimit")) {
                        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_USER_OVER_AGE_LIMIT;
                    }
                    break;
            }
            return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_CUSTOM;
        }
        return DeveloperConsentOuterClass.DeveloperConsentType.DEVELOPER_CONSENT_TYPE_UNSPECIFIED;
    }

    @Override // com.unity3d.ads.core.data.datasource.DeveloperConsentDataSource
    public DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        newBuilder.getClass();
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        _create.addAllOptions(_create.getOptions(), developerConsentList());
        return _create._build();
    }
}
