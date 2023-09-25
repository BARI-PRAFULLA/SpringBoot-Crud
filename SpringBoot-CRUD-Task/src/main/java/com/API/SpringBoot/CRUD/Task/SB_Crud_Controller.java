package com.API.SpringBoot.CRUD.Task;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB_Crud_Controller {

	@RequestMapping("Sp")
	String method() {
		return "samkaran";
	}

	ArrayList<WorkersSB> cc = new ArrayList<>();

	public SB_Crud_Controller() {

		cc.add(new WorkersSB(111, "raghav", "raghav@.com"));
		cc.add(new WorkersSB(112, "charli", "charli23@gmail.com"));
		cc.add(new WorkersSB(113, "Tiger", "tiger995@gmail.com"));
		cc.add(new WorkersSB(114, "dipak", "dipak43@gmail.com"));
		cc.add(new WorkersSB(115, "sanjay", "sanjay623@gmail.com"));
	}

	@GetMapping("allRecords")
	public ArrayList<WorkersSB> multipleRecordShow() {
		return cc;
	}

	@GetMapping("allRecords/{id}")
	public WorkersSB SingleRecordShow(@PathVariable int id) {
		WorkersSB ww = new WorkersSB();
		for (WorkersSB workersSB : cc) {
			if (workersSB.id == id) {
				ww = workersSB;
			}
		}
		return ww;
	}

	@PostMapping("insertRecord")
	public ArrayList<WorkersSB> insertRecordShow(@RequestBody WorkersSB workersSB) {
		cc.add(workersSB);
		return cc;
	}

	@PutMapping("updateRecords")
	public WorkersSB updateRecordShow(@RequestBody WorkersSB workersSBid) {
		WorkersSB ww = new WorkersSB();
		for (WorkersSB workersSB : cc) {
			if (workersSB.id == workersSBid.id) {
				ww = workersSB;
			}
		}
		ww.setId(workersSBid.id);
		ww.setName(workersSBid.name);
		System.out.println(cc);
		return ww;
	}

	@DeleteMapping("deleteRecords/{id}")
	public WorkersSB deleteRecordShow(@PathVariable int id) {
		WorkersSB ww = new WorkersSB();
		for (WorkersSB workersSB : cc) {
			if (workersSB.id == id) {
				ww = workersSB;
			}
		}
		cc.remove(ww);
		return ww;
	}
}