.class public Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
.super Lc5/a;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/e;
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# static fields
.field public static final B:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

.field public static final C:Lcom/google/android/gms/common/api/Scope;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static final D:Lcom/google/android/gms/common/api/Scope;

.field public static final E:Lcom/google/android/gms/common/api/Scope;

.field public static final F:Lcom/google/android/gms/common/api/Scope;

.field public static final G:Lu/f;


# instance fields
.field public final A:Ljava/lang/String;

.field public final a:I

.field public final b:Ljava/util/ArrayList;

.field public final c:Landroid/accounts/Account;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public static constructor <clinit>()V
    .locals 28

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Scope;

    .line 2
    .line 3
    const-string v1, "profile"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    .line 10
    .line 11
    const-string v3, "email"

    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->C:Lcom/google/android/gms/common/api/Scope;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/gms/common/api/Scope;

    .line 19
    .line 20
    const-string v3, "openid"

    .line 21
    .line 22
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->D:Lcom/google/android/gms/common/api/Scope;

    .line 26
    .line 27
    new-instance v3, Lcom/google/android/gms/common/api/Scope;

    .line 28
    .line 29
    const-string v4, "https://www.googleapis.com/auth/games_lite"

    .line 30
    .line 31
    invoke-direct {v3, v2, v4}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->E:Lcom/google/android/gms/common/api/Scope;

    .line 35
    .line 36
    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    .line 37
    .line 38
    const-string v5, "https://www.googleapis.com/auth/games"

    .line 39
    .line 40
    invoke-direct {v4, v2, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v4, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->F:Lcom/google/android/gms/common/api/Scope;

    .line 44
    .line 45
    const/16 v16, 0x0

    .line 46
    .line 47
    const/4 v14, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    const/4 v12, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x0

    .line 53
    new-instance v2, Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v15, Ljava/util/HashMap;

    .line 59
    .line 60
    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->F:Lcom/google/android/gms/common/api/Scope;

    .line 70
    .line 71
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    sget-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->E:Lcom/google/android/gms/common/api/Scope;

    .line 78
    .line 79
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_0

    .line 84
    .line 85
    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_0
    new-instance v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 89
    .line 90
    new-instance v8, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 93
    .line 94
    .line 95
    const/4 v7, 0x3

    .line 96
    move-object v6, v0

    .line 97
    invoke-direct/range {v6 .. v16}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    sput-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->B:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 101
    .line 102
    const/16 v27, 0x0

    .line 103
    .line 104
    const/16 v25, 0x0

    .line 105
    .line 106
    const/16 v24, 0x0

    .line 107
    .line 108
    const/16 v23, 0x0

    .line 109
    .line 110
    const/16 v22, 0x0

    .line 111
    .line 112
    const/16 v20, 0x0

    .line 113
    .line 114
    const/16 v21, 0x0

    .line 115
    .line 116
    new-instance v0, Ljava/util/HashSet;

    .line 117
    .line 118
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 119
    .line 120
    .line 121
    new-instance v26, Ljava/util/HashMap;

    .line 122
    .line 123
    invoke-direct/range {v26 .. v26}, Ljava/util/HashMap;-><init>()V

    .line 124
    .line 125
    .line 126
    const/4 v1, 0x0

    .line 127
    new-array v1, v1, [Lcom/google/android/gms/common/api/Scope;

    .line 128
    .line 129
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 137
    .line 138
    .line 139
    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->F:Lcom/google/android/gms/common/api/Scope;

    .line 140
    .line 141
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-eqz v1, :cond_1

    .line 146
    .line 147
    sget-object v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->E:Lcom/google/android/gms/common/api/Scope;

    .line 148
    .line 149
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_1

    .line 154
    .line 155
    invoke-interface {v0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_1
    new-instance v17, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 159
    .line 160
    new-instance v1, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 163
    .line 164
    .line 165
    const/16 v18, 0x3

    .line 166
    .line 167
    move-object/from16 v19, v1

    .line 168
    .line 169
    invoke-direct/range {v17 .. v27}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    new-instance v0, Lv4/b;

    .line 173
    .line 174
    const/16 v1, 0x19

    .line 175
    .line 176
    invoke-direct {v0, v1}, Lv4/b;-><init>(I)V

    .line 177
    .line 178
    .line 179
    sput-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 180
    .line 181
    new-instance v0, Lu/f;

    .line 182
    .line 183
    const/4 v1, 0x2

    .line 184
    invoke-direct {v0, v1}, Lu/f;-><init>(I)V

    .line 185
    .line 186
    .line 187
    sput-object v0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->G:Lu/f;

    .line 188
    .line 189
    return-void
.end method

.method public constructor <init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    .line 15
    .line 16
    iput-object p7, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->x:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->y:Ljava/lang/String;

    .line 19
    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-interface {p9}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->z:Ljava/util/ArrayList;

    .line 30
    .line 31
    iput-object p10, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->A:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public static d(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    .locals 17

    .line 1
    invoke-static/range {p0 .. p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    move-object/from16 v2, p0

    .line 12
    .line 13
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ljava/util/HashSet;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "scopes"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const/4 v5, 0x0

    .line 32
    :goto_0
    if-ge v5, v4, :cond_1

    .line 33
    .line 34
    new-instance v6, Lcom/google/android/gms/common/api/Scope;

    .line 35
    .line 36
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    const/4 v8, 0x1

    .line 41
    invoke-direct {v6, v8, v7}, Lcom/google/android/gms/common/api/Scope;-><init>(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const-string v3, "accountName"

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move-object v3, v1

    .line 64
    :goto_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    new-instance v4, Landroid/accounts/Account;

    .line 71
    .line 72
    const-string v5, "com.google"

    .line 73
    .line 74
    invoke-direct {v4, v3, v5}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    move-object v9, v4

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move-object v9, v1

    .line 80
    :goto_2
    new-instance v3, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 81
    .line 82
    new-instance v8, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 85
    .line 86
    .line 87
    const-string v2, "idTokenRequested"

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    const-string v2, "serverAuthRequested"

    .line 94
    .line 95
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    const-string v2, "forceCodeForRefreshToken"

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    const-string v2, "serverClientId"

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    if-eqz v4, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    move-object v13, v2

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move-object v13, v1

    .line 120
    :goto_3
    const-string v2, "hostedDomain"

    .line 121
    .line 122
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_5

    .line 127
    .line 128
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    :cond_5
    move-object v14, v1

    .line 133
    new-instance v15, Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 136
    .line 137
    .line 138
    const/4 v7, 0x3

    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    move-object v6, v3

    .line 142
    invoke-direct/range {v6 .. v16}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;-><init>(ILjava/util/ArrayList;Landroid/accounts/Account;ZZZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v3
.end method

.method public static e(Ljava/util/ArrayList;)Ljava/util/HashMap;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, La5/a;

    .line 24
    .line 25
    iget v2, v1, La5/a;->b:I

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->x:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    :try_start_0
    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->z:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-gtz v3, :cond_6

    .line 18
    .line 19
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->z:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    iget-object v4, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-lez v3, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    new-instance v5, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-ne v3, v5, :cond_6

    .line 44
    .line 45
    new-instance v3, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->containsAll(Ljava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    .line 59
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 60
    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    if-nez v3, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    :try_start_2
    invoke-virtual {v1, v3}, Landroid/accounts/Account;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v1
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    .line 76
    iget-object v3, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->x:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    :try_start_3
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_6

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    :goto_1
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    .line 95
    .line 96
    iget-boolean v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    .line 97
    .line 98
    if-ne v0, v1, :cond_6

    .line 99
    .line 100
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 101
    .line 102
    iget-boolean v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 103
    .line 104
    if-ne v0, v1, :cond_6

    .line 105
    .line 106
    iget-boolean v0, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 107
    .line 108
    iget-boolean v1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 109
    .line 110
    if-ne v0, v1, :cond_6

    .line 111
    .line 112
    iget-object v0, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->A:Ljava/lang/String;

    .line 113
    .line 114
    iget-object p1, p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->A:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result p1
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_0

    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    const/4 p1, 0x1

    .line 123
    return p1

    .line 124
    :catch_0
    :cond_6
    :goto_2
    return v2
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_0
    if-ge v4, v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    check-cast v5, Lcom/google/android/gms/common/api/Scope;

    .line 21
    .line 22
    iget-object v5, v5, Lcom/google/android/gms/common/api/Scope;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    add-int/lit8 v4, v4, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v1

    .line 41
    mul-int/lit8 v0, v0, 0x1f

    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    move v1, v3

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    :goto_1
    add-int/2addr v0, v1

    .line 54
    mul-int/lit8 v0, v0, 0x1f

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->x:Ljava/lang/String;

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    move v1, v3

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    :goto_2
    add-int/2addr v0, v1

    .line 67
    mul-int/lit8 v0, v0, 0x1f

    .line 68
    .line 69
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    .line 70
    .line 71
    add-int/2addr v0, v1

    .line 72
    mul-int/lit8 v0, v0, 0x1f

    .line 73
    .line 74
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 75
    .line 76
    add-int/2addr v0, v1

    .line 77
    mul-int/lit8 v0, v0, 0x1f

    .line 78
    .line 79
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 80
    .line 81
    add-int/2addr v0, v1

    .line 82
    mul-int/lit8 v0, v0, 0x1f

    .line 83
    .line 84
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->A:Ljava/lang/String;

    .line 85
    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    :goto_3
    add-int/2addr v0, v3

    .line 94
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget v2, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->a:I

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {p1, v2, v1, v3}, Lp7/a0;->s0(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    iget-object v2, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->c:Landroid/accounts/Account;

    .line 27
    .line 28
    invoke-static {p1, v1, v2, p2, v3}, Lp7/a0;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 29
    .line 30
    .line 31
    const/4 p2, 0x4

    .line 32
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->d:Z

    .line 33
    .line 34
    invoke-static {p1, p2, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 35
    .line 36
    .line 37
    const/4 p2, 0x5

    .line 38
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->e:Z

    .line 39
    .line 40
    invoke-static {p1, p2, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 41
    .line 42
    .line 43
    const/4 p2, 0x6

    .line 44
    iget-boolean v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->f:Z

    .line 45
    .line 46
    invoke-static {p1, p2, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 47
    .line 48
    .line 49
    const/4 p2, 0x7

    .line 50
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->x:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {p1, p2, v1, v3}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    const/16 p2, 0x8

    .line 56
    .line 57
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->y:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p1, p2, v1, v3}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->z:Ljava/util/ArrayList;

    .line 63
    .line 64
    const/16 v1, 0x9

    .line 65
    .line 66
    invoke-static {p1, v1, p2, v3}, Lp7/a0;->s0(Landroid/os/Parcel;ILjava/util/List;Z)V

    .line 67
    .line 68
    .line 69
    const/16 p2, 0xa

    .line 70
    .line 71
    iget-object v1, p0, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->A:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {p1, p2, v1, v3}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
