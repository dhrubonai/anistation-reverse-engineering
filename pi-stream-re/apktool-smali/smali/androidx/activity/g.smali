.class public final Landroidx/activity/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/j;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/b0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/j;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/u;Landroidx/lifecycle/n;)V
    .locals 1

    .line 1
    iget p1, p0, Landroidx/activity/g;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :pswitch_0
    sget-object p1, Landroidx/lifecycle/n;->ON_STOP:Landroidx/lifecycle/n;

    .line 9
    .line 10
    if-ne p2, p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/j;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void

    .line 30
    :pswitch_1
    sget-object p1, Landroidx/lifecycle/n;->ON_DESTROY:Landroidx/lifecycle/n;

    .line 31
    .line 32
    if-ne p2, p1, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/j;

    .line 35
    .line 36
    iget-object p1, p1, Landroidx/activity/j;->mContextAwareHelper:Lb/a;

    .line 37
    .line 38
    iput-object v0, p1, Lb/a;->b:Landroid/content/Context;

    .line 39
    .line 40
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/j;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-nez p1, :cond_2

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/j;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/activity/j;->getViewModelStore()Landroidx/lifecycle/b1;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroidx/lifecycle/b1;->a()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void

    .line 58
    :goto_0
    iget-object p1, p0, Landroidx/activity/g;->b:Landroidx/activity/j;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/activity/j;->ensureViewModelStore()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Landroidx/activity/j;->getLifecycle()Landroidx/lifecycle/p;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, p0}, Landroidx/lifecycle/p;->b(Landroidx/lifecycle/t;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
