package mono.android.support.v4.content;


public class Loader_OnLoadCanceledListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v4.content.Loader.OnLoadCanceledListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadCanceled:(Landroid/support/v4/content/Loader;)V:GetOnLoadCanceled_Landroid_support_v4_content_Loader_Handler:Android.Support.V4.Content.Loader/IOnLoadCanceledListenerInvoker, Xamarin.Android.Support.v4\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Content.Loader/IOnLoadCanceledListenerImplementor, Xamarin.Android.Support.v4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Loader_OnLoadCanceledListenerImplementor.class, __md_methods);
	}


	public Loader_OnLoadCanceledListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Loader_OnLoadCanceledListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Content.Loader/IOnLoadCanceledListenerImplementor, Xamarin.Android.Support.v4, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onLoadCanceled (android.support.v4.content.Loader p0)
	{
		n_onLoadCanceled (p0);
	}

	private native void n_onLoadCanceled (android.support.v4.content.Loader p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
