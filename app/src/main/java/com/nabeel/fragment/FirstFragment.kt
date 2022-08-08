package com.nabeel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
  class FirstFragment : Fragment(), ActivityInterface {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var mainActivity: MainActivity
    lateinit var initView: View
    lateinit var frameLayout: FrameLayout
    lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        mainActivity = activity as MainActivity
        mainActivity.activityInterface = this

    }



     override fun setBackgroundColor(color:Int, i: Int) {
         tv.setText("Changed Colour $i times")
        when (color) {
            1 -> {
                frameLayout.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.white))
                tv.setText(i.toString())
            }
            2 -> {
                frameLayout. setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.purple_500))
                tv.setText(i.toString())
            }
            3 -> {
                frameLayout.setBackgroundColor(ContextCompat.getColor(mainActivity, R.color.black))
                tv.setText(i.toString())

            }else-> {}

        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        initView = inflater.inflate(R.layout.fragment_first, container, false)
        frameLayout = initView.findViewById(R.id.frameLayout)
        tv =initView.findViewById(R.id.tv)
        return initView.rootView
    }

    private object companion {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String): FirstFragment {
            val firstFragment = FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
            return firstFragment
        }
    }

}