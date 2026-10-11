.class public final Lzn6;
.super Ljava/lang/Object;
.source "r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f"

# interfaces
.implements Lt55;


# instance fields
.field public final a:Ltn6;

.field public final b:Landroid/os/Handler;

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Lcom/unity3d/ads/RewardedAd;

.field public j:Lyn6;


# direct methods
.method public constructor <init>(Ltn6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzn6;->a:Ltn6;

    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lzn6;->b:Landroid/os/Handler;

    .line 16
    .line 17
    return-void
.end method

.method public static d(Ljava/lang/String;Lcom/unity3d/ads/UnityAdsError;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/unity3d/ads/UnityAdsError;->getCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/unity3d/ads/UnityAdsError;->getMessage()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v1, " failed ("

    .line 10
    .line 11
    const-string v2, "): "

    .line 12
    .line 13
    const-string v3, "Unity Ads "

    .line 14
    .line 15
    invoke-static {v0, v3, p0, v1, v2}, Lh11;->m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "UnityRewardedAds"

    .line 27
    .line 28
    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Lu55;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lzn6;->j:Lyn6;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lyn6;->c:Lf05;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lzn6;->j:Lyn6;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lf05;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    const-string v0, "800363057"

    .line 2
    .line 3
    invoke-static {v0}, Lb06;->L(Ljava/lang/String;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    const-string v1, "Rewarded_Android"

    .line 10
    .line 11
    invoke-static {v1}, Luz5;->V(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_2

    .line 16
    .line 17
    const-string v2, "REPLACE_WITH"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-static {v1, v2, v3}, Luz5;->M(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    invoke-static {}, Lcom/unity3d/ads/UnityAds;->isInitialized()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    iput-boolean v3, p0, Lzn6;->c:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Lzn6;->c()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    iget-boolean v1, p0, Lzn6;->d:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    iput-boolean v3, p0, Lzn6;->d:Z

    .line 44
    .line 45
    new-instance v1, Lcom/unity3d/ads/InitializationConfiguration$Builder;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Lcom/unity3d/ads/InitializationConfiguration$Builder;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-virtual {v1, v0}, Lcom/unity3d/ads/InitializationConfiguration$Builder;->withTestMode(Z)Lcom/unity3d/ads/InitializationConfiguration$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v1, Lcom/unity3d/ads/LogLevel;->ERROR:Lcom/unity3d/ads/LogLevel;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/unity3d/ads/InitializationConfiguration$Builder;->withLogLevel(Lcom/unity3d/ads/LogLevel;)Lcom/unity3d/ads/InitializationConfiguration$Builder;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lcom/unity3d/ads/InitializationConfiguration$Builder;->build()Lcom/unity3d/ads/InitializationConfiguration;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, Lvn6;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lvn6;-><init>(Lzn6;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Lcom/unity3d/ads/UnityAds;->initialize(Lcom/unity3d/ads/InitializationConfiguration;Lcom/unity3d/ads/InitializationListener;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const-string v0, "UnityRewardedAds"

    .line 75
    .line 76
    const-string v1, "Unity Ads is disabled because placeholder IDs are still configured."

    .line 77
    .line 78
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    .line 80
    .line 81
    sget-object v0, Lu55;->B:Lu55;

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Lzn6;->a(Lu55;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lzn6;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lzn6;->e:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lzn6;->i:Lcom/unity3d/ads/RewardedAd;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-boolean v0, p0, Lzn6;->f:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lzn6;->e:Z

    .line 20
    .line 21
    new-instance v0, Lcom/unity3d/ads/LoadConfiguration$Builder;

    .line 22
    .line 23
    const-string v1, "Rewarded_Android"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lcom/unity3d/ads/LoadConfiguration$Builder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/unity3d/ads/LoadConfiguration$Builder;->build()Lcom/unity3d/ads/LoadConfiguration;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, Lcom/unity3d/ads/RewardedAd;->Companion:Lcom/unity3d/ads/RewardedAd$Companion;

    .line 33
    .line 34
    new-instance v2, Lwn6;

    .line 35
    .line 36
    invoke-direct {v2, p0}, Lwn6;-><init>(Lzn6;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0, v2}, Lcom/unity3d/ads/RewardedAd$Companion;->load(Lcom/unity3d/ads/LoadConfiguration;Lcom/unity3d/ads/LoadListener;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void
.end method

.method public final e(Lsb2;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, La34;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Lsb2;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Lca;

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    invoke-direct {v0, p1, v1}, Lca;-><init>(Lsb2;B)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lzn6;->b:Landroid/os/Handler;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final f()V
    .locals 5

    .line 1
    iget-object v0, p0, Lzn6;->j:Lyn6;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, v0, Lyn6;->a:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/app/Activity;

    .line 13
    .line 14
    iget-object v1, p0, Lzn6;->i:Lcom/unity3d/ads/RewardedAd;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iput-object v2, p0, Lzn6;->i:Lcom/unity3d/ads/RewardedAd;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    iput-boolean v2, p0, Lzn6;->f:Z

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    iput-boolean v2, p0, Lzn6;->g:Z

    .line 41
    .line 42
    iput-boolean v2, p0, Lzn6;->h:Z

    .line 43
    .line 44
    new-instance v2, Lcom/unity3d/ads/ShowConfiguration$Builder;

    .line 45
    .line 46
    invoke-direct {v2}, Lcom/unity3d/ads/ShowConfiguration$Builder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v3, "highest_quality_download"

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lcom/unity3d/ads/ShowConfiguration$Builder;->withCustomRewardString(Ljava/lang/String;)Lcom/unity3d/ads/ShowConfiguration$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Lcom/unity3d/ads/ShowConfiguration$Builder;->build()Lcom/unity3d/ads/ShowConfiguration;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    new-instance v3, Leo3;

    .line 60
    .line 61
    const/16 v4, 0x17

    .line 62
    .line 63
    invoke-direct {v3, p0, v4}, Leo3;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0, v2, v3}, Lcom/unity3d/ads/RewardedAd;->show(Landroid/content/Context;Lcom/unity3d/ads/ShowConfiguration;Lcom/unity3d/ads/RewardedShowListener;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_2
    :goto_0
    iput-object v2, p0, Lzn6;->i:Lcom/unity3d/ads/RewardedAd;

    .line 71
    .line 72
    sget-object v0, Lu55;->z:Lu55;

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Lzn6;->a(Lu55;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lzn6;->c()V

    .line 78
    .line 79
    .line 80
    return-void
.end method
